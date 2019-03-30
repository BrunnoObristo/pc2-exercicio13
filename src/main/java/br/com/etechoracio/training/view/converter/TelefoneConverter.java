package br.com.etechoracio.training.view.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.stereotype.Component;

@Component(value="TelefoneConverter")
public class TelefoneConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		String Telefone = value;
		if(Telefone !=null && !Telefone.equals("")){
		   Telefone = value.replaceAll("[^0-9]", "");
		   
		}
				
		return Telefone;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String Telefone = String.valueOf(value);
		if (Telefone !=null && Telefone.length() ==10) {
		Telefone= "(" + Telefone.substring(0,2) + ")" +
				Telefone.substring(3);
		}
		return Telefone;
	}
	
}
