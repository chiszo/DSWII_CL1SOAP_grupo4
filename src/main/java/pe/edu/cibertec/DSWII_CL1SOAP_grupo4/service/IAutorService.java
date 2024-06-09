package pe.edu.cibertec.DSWII_CL1SOAP_grupo4.service;

import pe.edu.cibertec.ws.objects.Autorws;

import java.util.List;

public interface IAutorService {
    List<Autorws> listarAutores();
    Autorws obtenerAutorxId(int id);
    Autorws registrarActualizarAutor(Autorws autor);
}
