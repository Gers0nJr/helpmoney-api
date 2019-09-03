package br.com.helpmoney.event.listener;

import java.net.URI;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.helpmoney.event.RecursoCriadoEvent;

@Component
public class RecursoCriadoListener implements ApplicationListener<RecursoCriadoEvent>{

	@Override
	public void onApplicationEvent(RecursoCriadoEvent recursoCriadoEvent) {
		
		Long codigo = recursoCriadoEvent.getCodigo();
		HttpServletResponse response = recursoCriadoEvent.getResponse();
		
		adicionarLocationHeader(codigo, response);
		
	}
	
	public void adicionarLocationHeader(Long codigo, HttpServletResponse response){
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
				.buildAndExpand(codigo).toUri();
		response.setHeader("Location", uri.toASCIIString());	
	}

}