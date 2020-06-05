package com.svg.etu.feed;

import java.util.List;

public interface FeedDAO {
	
	/*
	 * Image를 삽입하는 함수
	 */
	public int insertFeed(FeedVO vo);
	
	/*
	 * Feed 리스트를 가져오는 함수
	 */
	public List<FeedVO> getFeedList();
	
}
