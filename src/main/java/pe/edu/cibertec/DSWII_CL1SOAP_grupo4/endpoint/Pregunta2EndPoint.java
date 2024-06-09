package pe.edu.cibertec.DSWII_CL1SOAP_grupo4.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.DSWII_CL1SOAP_grupo4.Pregunta2.ABisiesto;
import pe.edu.cibertec.DSWII_CL1SOAP_grupo4.Pregunta2.BPromedioAlumno;
import pe.edu.cibertec.DSWII_CL1SOAP_grupo4.Pregunta2.CSerieNumero;
import pe.edu.cibertec.DSWII_CL1SOAP_grupo4.Pregunta2.DTrafico;
import pe.edu.cibertec.DSWII_CL1SOAP_grupo4.exception.NotFoundException;
import pe.edu.cibertec.ws.objects.*;

@AllArgsConstructor
@Endpoint
public class Pregunta2EndPoint {
    private ABisiesto abisiesto;
    private BPromedioAlumno bpromedioAlumno;
    private CSerieNumero cserieNumero;
    private DTrafico dTrafico;

    private static final String NAMESPACE_URL = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getAnoBisiestoRequest")
    @ResponsePayload
    public GetAnoBisiestoResponse getAnoBisiesto(@RequestPayload
                                                 GetAnoBisiestoRequest request){
        GetAnoBisiestoResponse response = new GetAnoBisiestoResponse();
        response.setResultado(abisiesto.resultado(request.getAno()));
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getPromedioRequest")
    @ResponsePayload
    public GetPromedioResponse getPromedio(@RequestPayload
                                                 GetPromedioRequest request){
        GetPromedioResponse response = new GetPromedioResponse();
        response.setResultado(bpromedioAlumno.resultado(request.getNota1(), request.getNota2(), request.getNota3()));
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getSerieNumeroRequest")
    @ResponsePayload
    public GetSerieNumeroResponse getSerieNumero(@RequestPayload
                                                 GetSerieNumeroRequest request){
        GetSerieNumeroResponse response = new GetSerieNumeroResponse();
        response.setResultado(cserieNumero.resultado(request.getLimite()));
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getAlcoholemiaRequest")
    @ResponsePayload
    public GetAlcoholemiaResponse getAlcoholemia(@RequestPayload
                                                 GetAlcoholemiaRequest request){
        GetAlcoholemiaResponse response = new GetAlcoholemiaResponse();
        response.setResultado(dTrafico.resultado(request.getIndicador(),request.getTasa()));
        return response;
    }

}
