package com.shopapp.controller;

import com.shopapp.domain.GroupDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/group")
public class GroupsController {

    //list of all groups
    @GetMapping
    public List<GroupDto> getGroups(@RequestBody GroupDto groupDto) {
        return new ArrayList<>();
    }
    //add group
    @PostMapping
    public GroupDto addGroup(@RequestBody GroupDto groupDto) {
        return new GroupDto();
    }
    //show group by id
    @GetMapping("/{groupId}")
    public GroupDto getById(@PathVariable Long groupId) {
        return new GroupDto();
    }
    //update group by id
    @PutMapping
    public GroupDto updateGroup(@RequestBody GroupDto groupDto) {
        return new GroupDto();
    }
}
