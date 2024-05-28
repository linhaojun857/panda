package com.panda.system.mapper;

import com.panda.system.domain.SysMovieCategory;
import com.panda.system.domain.SysMovieToCategory;

import java.util.List;


public interface SysMovieCategoryMapper {

    List<SysMovieCategory> findAllCategorys();

    SysMovieCategory findCategoryById(Long id);

    List<SysMovieCategory> findOneMovieCategorys(Long id);

    int addCategory(SysMovieCategory sysMovieCategory);

    int updateCategory(SysMovieCategory sysMovieCategory);

    int deleteCategory(Long id);

    int addMovieToCategory(SysMovieToCategory sysMovieToCategory);

    int deleteMovieToCategory(SysMovieToCategory sysMovieToCategory);

}
