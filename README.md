# HW3_2_1223223
> 안드로이드 스튜디오(자바 활용) 공부 - 스마트 모바일 프로그래밍 과제 2              
> 참고 : https://lktprogrammer.tistory.com/134(FrameLayout 관련)               
> 참고: https://stackoverflow.com/questions/3482742/what-is-the-difference-between-gravity-and-layout-gravity-in-android(gravity와 layout_gravity관련)
### 앱 실행화면
<img width="300" alt="과제 3 완료 캡쳐" src="https://user-images.githubusercontent.com/68562176/115564401-6595c980-a2f3-11eb-9ba3-46c43a5ec73c.png">    

### 과제 내용
1. 여러 개의 레이아웃 겹쳐서 화면 구현
2. 레이아웃을 누르면 해당 레이아웃의 너비과 높이 토스트 메세지 출력

### 새롭게 알게 된 내용
1. gravity와 layout_gravity의 차이
2. FrameLayout
3. getWidth(), getHeight() : 레이아웃의 너비와 높이 가져오기
---------
#### gravity 와 layout_gravity
* gravity : view 안에 있는 content(내용)을 정렬한다.
* layout_gravity : view 또는 layout을 그것에 부모에 대하여 정렬한다.       
▼ 예시 ▼     
왼쪽 - 기본 상태(gravity와 layout_gravity 모두 설정XX)      
가운데 - gravity가 "center"일 때     
오른쪽 - layout_gravity가 "center"일 때

<img width="300" alt="gravityXXlayout_gravityXX" src="https://user-images.githubusercontent.com/68562176/115569447-303faa80-a2f8-11eb-9ad0-510a3abe692f.png">  <img width="300" alt="gravityOO" src="https://user-images.githubusercontent.com/68562176/115570397-0a66d580-a2f9-11eb-9c3e-2523351942d0.png">   <img width="300" alt="layout_gravityOO" src="https://user-images.githubusercontent.com/68562176/115570450-1783c480-a2f9-11eb-8166-95bb29a44dff.png">

앱 실행화면을 보면 정사각형 모양의 레이아웃 3개가 모두 가운데에 정렬되어 있다.         
(view의 안쪽 요소를 정렬하는 것이 아니라, **layout을 전체 화면인 부모 레이아웃(FrameLayout)에 대하여 가운데 center에 정렬하는 것이다.**)         
-> ```android:layout_gravity="center"``` 
