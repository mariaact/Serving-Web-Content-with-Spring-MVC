package org.mcalvot.formacion.ServingWebContentWithSpringMVC;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SaludoController {

    @GetMapping("/getSaludo")
    public String getSaludo(@RequestParam(name="nombre", required=false, defaultValue="World")
                                        String nombre, Model model){

        model.addAttribute("nombre", nombre);
        return "Saludo";

    }
}
