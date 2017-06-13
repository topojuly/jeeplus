package com.jeeplus.blog.mapper;

import com.jeeplus.blog.common.Pagination;
import com.jeeplus.blog.entities.BlogMsgBoard;

import java.util.List;
import java.util.Map;

/**
 * @author:yuzp17311
 * @version:v1.0
 * @date: 2017-05-24 20:05.
 */
public interface BlogReportMapper {

    /**
     * 网站每天请求数
     * @param limit
     * @param website
     * @return
     * @throws Exception
     */
    List<Map<String, Object>> dayHttpReq(Integer limit, String website)throws Exception;

    /**
     * 博客访问情况
     * @return
     * @throws Exception
     */
    List<Map<String, Object>> sumBlogAccess()throws Exception;



    /**
     * 博客代理类型
     * @return
     * @throws Exception
     */
    List<Map<String, Object>> blogAgent()throws Exception;


    /**
     * 日志发表日统计
     * @param limit
     * @param website
     * @return
     * @throws Exception
     */
    List<Map<String, Object>> dayOfArticleQuantity(Integer limit, String website)throws Exception;


    /**
     * 网站访问情况
     * @param limit 显示条数
     * @param page 页码
     * @param website 网站
     * @param map 查询参数
     * @return
     * @throws Exception
     */
    Pagination websiteAccessLog(Integer limit, Integer page, String website, Map<String, Object> map)throws Exception;


    /**
     * 网站日志占比
     * @return
     * @throws Exception
     */
    List<Map<String, Object>> articlePercent()throws Exception;

    /**
     * 博客网站统计
     * @param siteId
     * @return
     * @throws Exception
     */
    Map<String, Object> websiteCountInfo(String siteId)throws Exception;

    /**
     * 博客动态
     * @param userid
     * @return
     * @throws Exception
     */
    Pagination blogTimeLine(Integer limit, Integer page, String userid)throws Exception;

    /**
     * 留言板
     * @param limit
     * @param page
     * @param website
     * @return
     * @throws Exception
     */
    Pagination blogMsgBoard(Integer limit, Integer page, String website)throws Exception;

    /**
     * 得到留言板回复信息列表
     * @param website
     * @param rootid
     * @return
     * @throws Exception
     */
    List<BlogMsgBoard>  getMsgBoardByrootId(String website, String rootid, Integer page)throws Exception;

}
