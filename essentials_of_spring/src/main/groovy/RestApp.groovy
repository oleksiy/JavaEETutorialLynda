import org.springframework.web.bind.annotation.RestController

@RestController
class RestApp {
    @RequestMapping("/")
    String index(){
        "Success!"
    }
}