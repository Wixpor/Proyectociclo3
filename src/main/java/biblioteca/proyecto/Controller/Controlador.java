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
import biblioteca.proyecto.Model.Prestamos;
import biblioteca.proyecto.Model.Usuarios;
import biblioteca.proyecto.Repository.Libros_repo;
import biblioteca.proyecto.Repository.Prestamos_repo;
import biblioteca.proyecto.Repository.Usuarios_repo;

@Controller
public class Controlador {
    @Autowired
    private Libros_repo lrp;

    @Autowired
    private Usuarios_repo urp;

    @Autowired
    private Prestamos_repo prp;

    
    @GetMapping("/index")
    public String index(Model modelo){
        return "index";      
        
    }
    @GetMapping("/Nuevo")
    public String nuevo(){
        return "Nuevo";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/loginc")
    public String loginc(){
        return "loginc";
    }
    
    @GetMapping("/loginu")
    public String loginu(){
        return "loginu";
    }
    @GetMapping("/Nuevousuario")
    public String Nuevousuario(){
        return "Nuevousuario";
    }
    


    @GetMapping("/registrado")
    public String registrado(Model modelo){
        List <Libros> lista_libros = lrp.findAll();
        modelo.addAttribute("lista_libros", lista_libros);
        return "registrado";
    }
    



    @GetMapping("/admin")
    public String admin(Model modelo){
        List <Libros> lista_libros = lrp.findAll();
        modelo.addAttribute("lista_libros", lista_libros);

        List <Usuarios> lista_usuarios = urp.findAll();
        modelo.addAttribute("lista_usuarios", lista_usuarios);

        List <Prestamos> lista_prestamos = prp.findAll();
        modelo.addAttribute("lista_prestamos", lista_prestamos);

        return "admin";
    }



    @GetMapping("/{Cod_libro}")
    public ModelAndView editar(@PathVariable(name="Cod_libro") int Cod_libro){
        ModelAndView modelo= new ModelAndView("Editar");
        Libros libros = lrp.getReferenceById(Cod_libro);
        modelo.addObject("libros",libros);
        return modelo;
    }




    @RequestMapping(value ="/guardar", method = RequestMethod.POST)
    public String guardar_libro(@ModelAttribute("libros") Libros libros){
        lrp.save(libros);
        return "redirect:/admin";
    }



    @RequestMapping(value ="/eliminar/{Cod_libro}")
    public String eliminar(@PathVariable(name="Cod_libro") int Cod_libro){
        lrp.deleteById(Cod_libro);
        return "redirect:/admin";
    }

    @RequestMapping(value ="/guardarprestamo", method = RequestMethod.POST)
    public String guardar_prestamo(@ModelAttribute("Prestamos") Prestamos prestamos){
        prp.save(prestamos);
        return "redirect:/registrado";
    }

    @RequestMapping(value ="/eliminarusuario/{Numero_ident}")
    public String eliminarusu(@PathVariable(name="Numero_ident") int Numero_ident){
        urp.deleteById(Numero_ident);
        return "redirect:/admin";
    }



    @RequestMapping(value ="/registro", method = RequestMethod.POST)
    public String registrar_usuario(@ModelAttribute("usuarios") Usuarios usuarios){
        urp.save(usuarios);
        return "redirect:/registrado?Usuario registrado";
    }


    
    @RequestMapping("/usuario")
    public String comprobar(@ModelAttribute(name="usuario") Usuarios usuario){
        var usr=usuario.getNumero_ident();
        var exist= urp.existsById(usr);
        var cont=usuario.getContra();

        if(exist==true){
            var contreal=urp.getReferenceById(usr).getContra();
            var auten=urp.getReferenceById(usr).getAdministrador();
            if (cont.equals(contreal)){
                if(auten!=null){
                    if(auten.equals("Si")){return "redirect:/admin";}
                    else{return "redirect:/registrado";}
                }
                else{return "redirect:/registrado";}
            }
            else{return "redirect:/loginc";}
        }
        else{return "redirect:/loginu";}

    }

}
