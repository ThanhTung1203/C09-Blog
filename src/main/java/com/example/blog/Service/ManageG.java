package com.example.blog.Service;

import com.example.blog.Model.Page;

import java.time.LocalDate;
import java.util.List;

public interface ManageG {

    Page findById(int id );
    void findByContent(String content);
    void findByTitle(String title);
    void delete(int id);



    void update(int id, Page page);
    void save(Page page);
    List<Page> showALl();
    void arrangeByTime(LocalDate localDate);


}
