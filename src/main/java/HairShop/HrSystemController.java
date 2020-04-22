package HairShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class HrSystemController {
@Autowired
HrSystemRepository hrSystemReposiory;

 @RequestMapping(value = "/hrSystems",
         method = RequestMethod.GET,
         produces = "application/json;charset=UTF-8")

 public void stylistSelection(HttpServletRequest request, HttpServletResponse response)
         throws Exception {

     System.out.println("##### /hrSystem/stylistSelection  called #####");
     // 스타일리스트 명을 조회한다 - 데이터 미존재시 Error 발생
     //hrSystemReposiory.findByName(request.getParameter("stylistName"));


 }
}