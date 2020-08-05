package ar.com.ada.api.challengebuquemejorado.models.response;

public class GenericResponse {
    
    public boolean isOk;
    public String id; // Porque vamos a devolver los ObjectId en formato string
    public String message;
}