package pro.kosenkov.inventory.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pro.kosenkov.inventory.web.dto.AccessRole;
import pro.kosenkov.inventory.web.dto.EmployeeDto;
import pro.kosenkov.inventory.web.dto.Gender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("defaultName", "defName");
        model.addAttribute("defaultValue", "Ivan");
        model.addAttribute("greetings", "Hello Word!");

        EmployeeDto employeeDto1 = EmployeeDto.builder()
                .firstName("Ivan")
                .lastName("Kenney")
                .email("ivan.kenney@gmail.com")
                .gender(Gender.MALE)
                .role(AccessRole.ADMIN)
                .build();

        model.addAttribute("employee", employeeDto1);

        EmployeeDto employeeDto2 = EmployeeDto.builder()
                .firstName("Anton")
                .lastName("Vallevsky")
                .email("a.val@gmail.com")
                .gender(Gender.MALE)
                .role(AccessRole.USER)
                .build();

        EmployeeDto employeeDto3 = EmployeeDto.builder()
                .firstName("Anna")
                .lastName("Petrovich")
                .email("anna.petr@gmail.com")
                .gender(Gender.FEMALE)
                .role(AccessRole.MODERATOR)
                .build();

        Map<String, EmployeeDto> employeeDtoMap = new HashMap<>();
        employeeDtoMap.put(employeeDto1.getFirstName(), employeeDto1);
        employeeDtoMap.put(employeeDto2.getFirstName(), employeeDto2);
        employeeDtoMap.put(employeeDto3.getFirstName(), employeeDto3);

        model.addAttribute("employeeDtoMap", employeeDtoMap);

        List<EmployeeDto> employeeDtoList = new ArrayList<>();
        employeeDtoList.add(employeeDto1);
        employeeDtoList.add(employeeDto2);
        employeeDtoList.add(employeeDto3);
        model.addAttribute("employeeDtoList", employeeDtoList);

        model.addAttribute("employeeObj", employeeDto1);

        // 7. Links
        model.addAttribute("test", "isOkMe");

        // 13. IF


        return "home";
    }

}
