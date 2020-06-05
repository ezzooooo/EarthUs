package com.svg.etu.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.svg.etu.aws.S3;
import com.svg.etu.feed.FeedService;
import com.svg.etu.feed.FeedVO;

@RestController
@RequestMapping("/feeds")
public class FeedController {
	@Autowired
	private FeedService feedService;
	
	/**
	 * 피드 추가 
	 * S3에 이미지 업로드
	 * @param vo FeedVO
	 * @param uploadFile MultipartFile
	 * @throws IOException
	 */
	@RequestMapping(method=RequestMethod.POST)
	public void insertFeed(FeedVO vo, @RequestParam("uploadFile")MultipartFile uploadFile) throws IOException {
		feedService.insertFeed(vo);
		S3.ImageUpload(uploadFile);
	}
	
	/*
	 * 피드 리스트를 가져옴
	 * @return List
	 */
	@RequestMapping(method=RequestMethod.GET, value = "")
	public List<FeedVO> getFeedList() {
		return feedService.getFeedList();
	}
}
