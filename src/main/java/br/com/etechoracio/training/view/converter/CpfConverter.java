package br.com.etechoracio.training.view.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.stereotype.Component;


@Component(value="CPFConverter")
public class CpfConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		String Cpf = value;
		if(Cpf!=null && !Cpf.equals("")) {
			Cpf=value.replaceAll("[^0-9]", "");
		}
		
		
		return Cpf;
	}
	

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String Cpf = String.valueOf(value);
		if (Cpf !=null && Cpf.length() ==11) {
			Cpf = Cpf.substring(0, 3) + "." +
			Cpf.substring(3, 6) + "." +
			Cpf.substring(6, 9) + "." +
			Cpf.substring(9, 11);
		}
		
		
		
		return Cpf;
		
	}

}
