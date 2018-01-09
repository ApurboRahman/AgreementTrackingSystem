package com.ats.controller.ats;

import com.ats.BaseConfiguration.baseController.BaseController;
import com.ats.dto.ContractProposalDTO;
import com.ats.helper.CurrentUser;
import com.ats.helper.CustomResponseMessage;
import com.ats.helper.DropdownDTO;
import com.ats.helper.ResponseMessage;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Apurbo on 11/12/2017.
 */
@RequestMapping(value = "/contractProposal")
public class ContractProposal extends BaseController {


    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(HttpServletRequest request, HttpServletResponse response, Model model) {

        List<DropdownDTO> dropdownDTOList = new ArrayList<>();

        dropdownDTOList.add(new DropdownDTO("drop One", 1));
        dropdownDTOList.add(new DropdownDTO("drop Two", 2));
        dropdownDTOList.add(new DropdownDTO("drop Three", 3));
        dropdownDTOList.add(new DropdownDTO("drop Four", 4));
        dropdownDTOList.add(new DropdownDTO("drop Five", 5));
        dropdownDTOList.add(new DropdownDTO("drop Six", 6));
        model.addAttribute("dropdownDTOList", dropdownDTOList);
        return "contractProposal";


    }

    @ResponseBody
    @RequestMapping(value = "/getSomething", method = RequestMethod.GET)
    public ResponseMessage getSomething(HttpServletRequest request, HttpServletResponse response, String testData) {
        // return "contractProposal";
        return customResponseMessage.toResponseMessage(applicationContext);


    }

/*    @ResponseBody
    @RequestMapping(value = "/getSomething", method = RequestMethod.GET)
    public String getSomething(HttpServletRequest request, HttpServletResponse response,String testData) {
        return "contractProposal";


    }*/

    @ResponseBody
    @RequestMapping(value = "/getNewLink", method = RequestMethod.GET)
    public ResponseMessage getNewLink(HttpServletRequest request, HttpServletResponse response) {
        customResponseMessage.addMessageCode("this is message");
        customResponseMessage.setStatus(1);
        return customResponseMessage.toResponseMessage(applicationContext);


    }


    @ResponseBody
    @RequestMapping(value = "/getOnSelectDropDownList", method = RequestMethod.GET)
    public ResponseMessage getOnSelectDropDownList(Integer dropdownList) {
        List<DropdownDTO> dropdownDTOList = new ArrayList<>();

        dropdownDTOList.add(new DropdownDTO("OnSelect One", 1));
        dropdownDTOList.add(new DropdownDTO("OnSelect Two", 2));
        dropdownDTOList.add(new DropdownDTO("OnSelect Three", 3));
        dropdownDTOList.add(new DropdownDTO("OnSelect Four", 4));
        dropdownDTOList.add(new DropdownDTO("OnSelect Five", 5));
        dropdownDTOList.add(new DropdownDTO("OnSelect Six", 6));

        customResponseMessage.setDTO(dropdownDTOList);
        customResponseMessage.setStatus(1);
        return customResponseMessage.toResponseMessage(applicationContext);


    }

    @ResponseBody
    @RequestMapping(value = "/getContractList", method = RequestMethod.GET)
    public ResponseMessage getContractList() {
        ContractProposalDTO contractProposalDTO = new ContractProposalDTO();
        contractProposalDTO.setSerialNo(1);
        contractProposalDTO.setContractName("Road and bridge construction");
        contractProposalDTO.setContractType("Government");
        contractProposalDTO.setContractBody("LGED");
        contractProposalDTO.setRemarks("Open");
        List<ContractProposalDTO> proposalDTOList = new ArrayList<>();
        proposalDTOList.add(contractProposalDTO);
        customResponseMessage.setDTO(proposalDTOList);
        customResponseMessage.setStatus(1);
        return customResponseMessage.toResponseMessage(applicationContext);


    }


    @ResponseBody
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseMessage save(HttpServletRequest request, HttpServletResponse response, @RequestBody ContractProposalDTO contractProposalDTO) {
        CurrentUser currentUser = getCurrentUser(request);
        customResponseMessage.setStatus(1);
        return customResponseMessage.toResponseMessage(applicationContext);


    }
}
