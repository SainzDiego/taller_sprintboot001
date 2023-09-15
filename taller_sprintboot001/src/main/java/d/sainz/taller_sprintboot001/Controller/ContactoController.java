package d.sainz.taller_sprintboot001.Controller;

import d.sainz.taller_sprintboot001.Model.Contacto;
import d.sainz.taller_sprintboot001.View.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ContactoController {
    //TODO: creamos contactoRepository
    //TODO:@Autowired nos permite inyectar esta dependicia y se encar de eso el nucle de spring mediante el principio ioc
    @Autowired
    private ContactoRepository contactoRepository;
    //usamos @GetMapping("") para mapear nuestra ruta esta reponde a la riz por eso no lleva nada ""
    @GetMapping
    public String index(Model model){
        //TODO: se realiza el uso del metodo findAll() el cual recupera todos los contacto de la base de datos
        List<Contacto> contactos=contactoRepository.findAll();
        model.addAttribute("contactos",contactos);
        return "index";//le desismos que reporne la plantilla index.html que creamos
    }
    //Model viene de string framework  algo asi com un motor de plantillas
    @GetMapping("/nuevo")
    public String nuevo(Model model){
        model.addAttribute("contacto",new Contacto());//esto me sirve como un formulario
        return "form";
    }
    @PostMapping("/nuevo")
    public String crear(Contacto contacto){
        //TODO:persistir el contacto
        contactoRepository.save(contacto);
        return"redirect:/";
    }
}


