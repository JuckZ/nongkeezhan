package com.nongkeezhan.nkez.controller;

import com.nongkeezhan.nkez.pojo.DTO.QueryPage;
import com.nongkeezhan.nkez.pojo.DTO.TechnologyDTO;
import com.nongkeezhan.nkez.pojo.DTO.UserDTO;
import com.nongkeezhan.nkez.pojo.Technology;
import com.nongkeezhan.nkez.pojo.TechnologyKey;
import com.nongkeezhan.nkez.pojo.User;
import com.nongkeezhan.nkez.pojo.VO.ResultVO;
import com.nongkeezhan.nkez.service.TechnologyService;
import com.nongkeezhan.nkez.service.UserService;
import com.nongkeezhan.nkez.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hugay on 2019/3/4
 */
@RestController
@RequestMapping("/nkezApi/technology")
public class TechnologyController {

    @Autowired
    private TechnologyService technologyService;

    /**
     * 添加技术，传入一个技术对象
     * @param technologyDTO
     * @return
     */
    @RequestMapping("/technology_add")
    public ResultVO technologyAdd(@RequestBody TechnologyDTO technologyDTO){
//        System.out.println(technology);
        System.out.println(technologyDTO);
        technologyService.addTechnology(technologyDTO);
        return ResultVOUtil.success();
    }

    /**
     * 传入技术Id，删除指定的技术
     * @param technology
     * @return
     */
    @RequestMapping("/technology_delete")
    public ResultVO technologyDelete(@RequestBody Technology technology){
        String id = technology.getTechologyId();
        TechnologyKey technologyKey = new TechnologyKey();
        technologyKey.setTechologyId(id);
        this.technologyService.deleteTechnology(technologyKey);
        return ResultVOUtil.success();
    }

    /**
     * 传入具有更新信息的技术对象
     * !!一定要传入主键id，因为这个是唯一不能够修改的！！！！！
     * @param technology
     * @return
     */
    @RequestMapping("/technology_update")
    public ResultVO technologyUpdate(@RequestBody TechnologyDTO technology){
        this.technologyService.updateTechnology(technology);
        return ResultVOUtil.success();
    }

    /**
     * 分页
     * @param queryPage
     * @return
     */
    @RequestMapping("/technology_list")
    public ResultVO technologyList(@RequestBody QueryPage queryPage){
        return ResultVOUtil.success(technologyService.getTechnologyList(queryPage));
    }

    /**
     * 获取某个单个的技术
     * @param technology
     * @return
     */
    @RequestMapping("/get_technology")
    public ResultVO getTechnology(@RequestBody Technology technology){
//        TechnologyKey technologyKey = new TechnologyKey();
//        technology.setTechologyId(technology.getTechologyId());
        this.technologyService.getTechnology(technology);
        return ResultVOUtil.success();
    }

    @RequestMapping("/technology_search")
    public ResultVO technologySearch(@RequestBody TechnologyDTO technologyDTO){
        return ResultVOUtil.success(this.technologyService.getTechnologyByParam(technologyDTO));
    }
}
