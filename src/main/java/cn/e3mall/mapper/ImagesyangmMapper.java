package cn.e3mall.mapper;

import cn.e3mall.pojo.Imagesyangm;
import cn.e3mall.pojo.ImagesyangmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImagesyangmMapper {
    long countByExample(ImagesyangmExample example);

    int deleteByExample(ImagesyangmExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Imagesyangm record);

    int insertSelective(Imagesyangm record);

    List<Imagesyangm> selectByExample(ImagesyangmExample example);

    Imagesyangm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Imagesyangm record, @Param("example") ImagesyangmExample example);

    int updateByExample(@Param("record") Imagesyangm record, @Param("example") ImagesyangmExample example);

    int updateByPrimaryKeySelective(Imagesyangm record);

    int updateByPrimaryKey(Imagesyangm record);
}