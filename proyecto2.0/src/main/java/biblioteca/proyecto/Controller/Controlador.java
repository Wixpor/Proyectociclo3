package biblioteca.proyecto.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import biblioteca.proyecto.Model.Libros;
import biblioteca.proyecto.Repository.Libros_repo;

@Controller
public class Controlador {
    @Autowired
    private Libros_repo lrp;
    
    @GetMapping("/index")
    public String index(Model modelo){
        List <Libros> lista_libros = lrp.findAll();
        modelo.addAttribute("lista_libros", lista_libros);
        return "index";
    }
    @GetMapping("/nuevo")
    public String nuevo(){
        return "nuevo";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/registrado")
    public String registrado(Model modelo){
        List <Libros> lista_libros = lrp.findAll();
        modelo.addAttribute("lista_libros", lista_libros);
        return "registrado";
    }



    @GetMapping("/{Cod_libro}")
    public ModelAndView editar(@PathVariable(name="Cod_libro") int Cod_libro){
        ModelAndView modelo= new ModelAndView("editar");
        Libros libros = lrp.getReferenceById(Cod_libro);
        modelo.addObject("libros",libros);
        return modelo;
    }




    @RequestMapping(value ="/guardar", method = RequestMethod.POST)
    public String guardar_libro(@ModelAttribute("libros") Libros libros){
        lrp.save(libros);
        return "redirect:/registrado";
    }

    @RequestMapping(value ="/eliminar/{Cod_libro}")
    public String eliminar(@PathVariable(name="Cod_libro") int Cod_libro){
        lrp.deleteById(Cod_libro);
        return "redirect:/registrado";
    }



}
