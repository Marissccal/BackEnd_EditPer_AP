package com.portfolio.marisscal.Interface;
import com.portfolio.marisscal.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    // listado de Personas
    public List<Persona> getPersona();
    
    //guardar Persona
    public void savePersona(Persona persona);
    
    //Eliminar Persona por Id
    public void deletePersona(Long id);
    
    //Buscar Persona por Id
    public Persona findPersona(Long id);
    
}
