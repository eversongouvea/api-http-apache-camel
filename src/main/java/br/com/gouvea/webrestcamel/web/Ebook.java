package br.com.gouvea.webrestcamel.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Api Places.
 * 
 * @author everson
 * @since 25/08/2019
 * @version 1.1
 */
@RestController
@RequestMapping(path = "/ebooks")
public class Ebook {

	@GetMapping()
	public ResponseEntity<String> getEbook(@RequestParam(name="pedidoId", defaultValue ="pedidoId",required=false) String pedidoId,
										  @RequestParam(name="clienteId",defaultValue ="clienteId",required=false) String clienteId,
										  @RequestParam(name="ebookId",defaultValue ="ebookId",required=false) String ebookId) {

		

		System.out.printf("Ebook ID: %s, Cliente ID: %s, Pedido ID: %s %n", ebookId, clienteId, pedidoId);
		
		return ResponseEntity.ok().body("Api RestFull");
   }
	
}
