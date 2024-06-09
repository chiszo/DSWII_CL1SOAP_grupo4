package pe.edu.cibertec.DSWII_CL1SOAP_grupo4.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_CL1SOAP_grupo4.convert.AutorConvert;
import pe.edu.cibertec.DSWII_CL1SOAP_grupo4.model.Autor;
import pe.edu.cibertec.DSWII_CL1SOAP_grupo4.repository.AutorRepository;
import pe.edu.cibertec.ws.objects.Autorws;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class AutorService implements IAutorService{

    private AutorRepository autorRepository;
    private AutorConvert autorConvert;

    @Override
    public List<Autorws> listarAutores() {
        return autorConvert.convertAutorToAutorWs(
                autorRepository.findAll());
    }

    @Override
    public Autorws obtenerAutorxId(int id) {
        Optional<Autor> autor = autorRepository.findById(id);
        return autor.map(value ->
                        autorConvert.convertAutorToAutorWs(value))
                .orElse(null);
    }

    @Override
    public Autorws registrarActualizarAutor(Autorws autorws) {
        Autor nuevoAutor = autorRepository.save(
                autorConvert.convertAutorwsToAutor(autorws));
        if(nuevoAutor == null)
            return  null;
        return autorConvert.convertAutorToAutorWs(nuevoAutor);
    }
}
