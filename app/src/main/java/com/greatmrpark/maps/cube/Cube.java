package com.greatmrpark.maps.cube;

import com.greatmrpark.maps.cube.model.CubeLocationVo;
import com.greatmrpark.maps.cube.model.CubePhotoVo;
import com.greatmrpark.maps.cube.model.CubeVo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cube {

    public Cube() {

    }

    public List<CubeVo> CubeList() {

        // 데이터가 적재되지 않았으면 데이터 저장소(DB)에서 데이터 가져오기
        List<CubeVo>  cubeList = new ArrayList<CubeVo>();
        Map<String, CubeVo> cubeMap = new HashMap<String, CubeVo>();

        ////////////////////////////////////////////////////////////////////////////////////////////
        String place_id = "1";
        String icon     = "https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png";
        String name     = "동대문디자인플라자 ('어울림광장')";
        String address  = "서울 중구 을지로 281";
        String describe = "동대문디자인플라자 어울림광장 내부 인포메이션";
        String link     = "http://limplanet.vbweb.kr/23/?q=YToxOntzOjEyOiJrZXl3b3JkX3R5cGUiO3M6MzoiYWxsIjt9&bmode=view&idx=667324&t=board";

        double lat = 127.0103381;
        double lng = 37.5682138;

        String photo_reference = "https://cdn.imweb.me/thumbnail/20180531/5b0f5af5aa3a3.jpg";
        long  height    = 288;
        long width      = 288;
        String html_attributions = "";

        // 위치정보를 세팅함
        CubeLocationVo cubeLocation = new CubeLocationVo();
        cubeLocation.setLat(lat);
        cubeLocation.setLng(lng);

        // 사진정보를 세팅함
        CubePhotoVo cubePhoto = new CubePhotoVo();
        cubePhoto.setPhoto_reference(photo_reference);
        cubePhoto.setWidth(width);
        cubePhoto.setHeight(height);
        cubePhoto.setHtml_attributions(html_attributions);

        // 큐브정보를 세팅함
        CubeVo cubeInfo = new CubeVo();
        cubeInfo.setPlace_id(place_id);
        cubeInfo.setIcon(icon);
        cubeInfo.setName(name);
        cubeInfo.setAddress(address);
        cubeInfo.setLink(link);
        cubeInfo.setDescribe(describe);
        cubeInfo.setGeometry(cubeLocation);
        cubeInfo.setPhotos(cubePhoto);

        // 1번 추가
        cubeList.add(cubeInfo);
        ////////////////////////////////////////////////////////////////////////////////////////////

        ////////////////////////////////////////////////////////////////////////////////////////////
        place_id = "2";
        icon     = "https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png";
        name     = "인사동 길 ('쌈지길')";
        address  = "서울특별시 종로구 관훈동 38";
        describe = "쌈지길' 2층 정수기 옆";
        link     = "http://limplanet.vbweb.kr/23/?q=YToxOntzOjEyOiJrZXl3b3JkX3R5cGUiO3M6MzoiYWxsIjt9&bmode=view&idx=667356&t=board";

        lat = 126.9848653;
        lng = 37.5742877;

        photo_reference = "https://cdn.imweb.me/thumbnail/20180531/5b0f5af564b36.jpg";
        height    = 288;
        width      = 288;
        html_attributions = "";

        // 위치정보를 세팅함
        cubeLocation.setLat(lat);
        cubeLocation.setLng(lng);

        // 사진정보를 세팅함
        cubePhoto.setPhoto_reference(photo_reference);
        cubePhoto.setWidth(width);
        cubePhoto.setHeight(height);
        cubePhoto.setHtml_attributions(html_attributions);

        cubeInfo.setPlace_id(place_id);
        cubeInfo.setIcon(icon);
        cubeInfo.setName(name);
        cubeInfo.setAddress(address);
        cubeInfo.setLink(link);
        cubeInfo.setDescribe(describe);
        cubeInfo.setGeometry(cubeLocation);
        cubeInfo.setPhotos(cubePhoto);

        // 2번 추가
        cubeList.add(cubeInfo);
        ////////////////////////////////////////////////////////////////////////////////////////////

        ////////////////////////////////////////////////////////////////////////////////////////////
        place_id = "3";
        icon     = "https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png";
        name     = "이화동 벽화마을 (까페 '개뿔')";
        address  = "서울특별시 종로구 이화동 9-443";
        describe = "카페 '개뿔'";
        link     = "http://limplanet.vbweb.kr/23/?q=YToxOntzOjEyOiJrZXl3b3JkX3R5cGUiO3M6MzoiYWxsIjt9&bmode=view&idx=667364&t=board";

        lat = 127.0080618;
        lng = 37.5781816;

        photo_reference = "https://cdn.imweb.me/thumbnail/20180531/5b0f5af527aca.jpg";
        height    = 288;
        width      = 288;
        html_attributions = "";


        // 위치정보를 세팅함
        cubeLocation.setLat(lat);
        cubeLocation.setLng(lng);

        // 사진정보를 세팅함
        cubePhoto.setPhoto_reference(photo_reference);
        cubePhoto.setWidth(width);
        cubePhoto.setHeight(height);
        cubePhoto.setHtml_attributions(html_attributions);

        cubeInfo.setPlace_id(place_id);
        cubeInfo.setIcon(icon);
        cubeInfo.setName(name);
        cubeInfo.setAddress(address);
        cubeInfo.setLink(link);
        cubeInfo.setDescribe(describe);
        cubeInfo.setGeometry(cubeLocation);
        cubeInfo.setPhotos(cubePhoto);

        // 3번추가
        cubeList.add(cubeInfo);
        ////////////////////////////////////////////////////////////////////////////////////////////

        ////////////////////////////////////////////////////////////////////////////////////////////
        place_id = "4";
        icon     = "https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png";
        name     = "남산골 한옥마을 ('숍 1890')";
        address  = "서울 중구 퇴계로34길 28 남산한옥마을";
        describe = "남산골한옥마을 내 '숍 1890' 데스크 옆";
        link     = "http://limplanet.vbweb.kr/23/?q=YToxOntzOjEyOiJrZXl3b3JkX3R5cGUiO3M6MzoiYWxsIjt9&bmode=view&idx=687294&t=board";

        lat = 126.9935610;
        lng = 37.5584554;

        photo_reference = "https://cdn.imweb.me/thumbnail/20180531/5b0f5af303280.jpg";
        height    = 288;
        width      = 288;
        html_attributions = "";

        // 위치정보를 세팅함
        cubeLocation.setLat(lat);
        cubeLocation.setLng(lng);

        // 사진정보를 세팅함
        cubePhoto.setPhoto_reference(photo_reference);
        cubePhoto.setWidth(width);
        cubePhoto.setHeight(height);
        cubePhoto.setHtml_attributions(html_attributions);

        cubeInfo.setPlace_id(place_id);
        cubeInfo.setIcon(icon);
        cubeInfo.setName(name);
        cubeInfo.setAddress(address);
        cubeInfo.setLink(link);
        cubeInfo.setDescribe(describe);
        cubeInfo.setGeometry(cubeLocation);
        cubeInfo.setPhotos(cubePhoto);

        // 4번 추가
        cubeList.add(cubeInfo);
        ////////////////////////////////////////////////////////////////////////////////////////////

        ////////////////////////////////////////////////////////////////////////////////////////////
        place_id = "5";
        icon     = "https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png";
        name     = "창신동 문구완구거리 ('승진완구')";
        address  = "서울특별시 종로구 창신동 390-3";
        describe = "창신동 문구완구거리 '승진완구' 데스크 옆";
        link     = "http://limplanet.vbweb.kr/23/?q=YToxOntzOjEyOiJrZXl3b3JkX3R5cGUiO3M6MzoiYWxsIjt9&bmode=view&idx=691328&t=board";

        lat = 127.0142045;
        lng = 37.5713426;

        photo_reference = "https://cdn.imweb.me/thumbnail/20180531/5b0f5af0e1874.jpg";
        height    = 288;
        width      = 288;
        html_attributions = "";

        // 위치정보를 세팅함
        cubeLocation.setLat(lat);
        cubeLocation.setLng(lng);

        // 사진정보를 세팅함
        cubePhoto.setPhoto_reference(photo_reference);
        cubePhoto.setWidth(width);
        cubePhoto.setHeight(height);
        cubePhoto.setHtml_attributions(html_attributions);

        cubeInfo.setPlace_id(place_id);
        cubeInfo.setIcon(icon);
        cubeInfo.setName(name);
        cubeInfo.setAddress(address);
        cubeInfo.setLink(link);
        cubeInfo.setDescribe(describe);
        cubeInfo.setGeometry(cubeLocation);
        cubeInfo.setPhotos(cubePhoto);

        // 5번 추가
        cubeList.add(cubeInfo);

        return cubeList;
    }
}
