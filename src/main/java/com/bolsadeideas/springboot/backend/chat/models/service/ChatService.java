package com.bolsadeideas.springboot.backend.chat.models.service;

import java.util.List;

import com.bolsadeideas.springboot.backend.chat.models.documents.Mensaje;

public interface ChatService {

	List<Mensaje> obtenerUltimos10Mensajes();
	Mensaje guardar(Mensaje mensaje);
}
