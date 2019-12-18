package GamePanel.controller;


import GamePanel.model.User;
import io.graversen.rust.rcon.rustclient.RustClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/teste")
public class TesteController {

    public TesteController(){

    }



    @RequestMapping("/myserver")
    public ModelAndView showInitialPage(){
        ModelAndView mv = new ModelAndView("dashboard/myserver.html");

        //RustClient rustClient = RustClient.builder()
        //        .connectTo("35.199.69.7", "l1u2i3z4", 28016)
        //        .build();

        //rustClient.open();
        //rustClient.send("say test");

        return mv;
    }
}
