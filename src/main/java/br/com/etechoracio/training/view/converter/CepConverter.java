package br.com.etechoracio.training.view.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.stereotype.Component;

@Component(value="CepConverter")
public class CepConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
			String Cep = value;
			if(Cep != null && !Cep.equals("")) {
				Cep = value.replaceAll("[^0-9]", "");
				
			}
			return Cep;
			
		
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		String Cep = String.valueOf(value);
		if (Cep != null && Cep.length() == 8) {
			Cep = Cep.substring(0, 6) + "." +
				  Cep.substring(7);
		}
		
		return Cep;
		
	}
	
}
