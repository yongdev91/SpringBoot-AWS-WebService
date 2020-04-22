# 스프링 부트와 AWS로 혼자 구현하는 웹서비스 [![Build Status](https://travis-ci.org/yongdev91/SpringBoot-AWS-WebService.svg?branch=master)](https://travis-ci.org/yongdev91/SpringBoot-AWS-WebService)

spring boot & aws 개인학습을 위한 프로젝트입니다.

목차 

01장 인텔리제이로 스프링 부트 시작하기<br/>
_1.1 인텔리제이 소개<br/>
_1.2 인텔리제이 설치하기<br/>
_1.3 인텔리제이 커뮤니티에서 프로젝트 생성하기<br/>
_1.4 그레이들 프로젝트를 스프링 부트 프로젝트로 변경하기<br/>
_1.5 인텔리제이에서 깃과 깃허브 사용하기<br/>
<br/><br/>
02장 스프링 부트에서 테스트 코드를 작성하자<br/>
_2.1 테스트 코드 소개<br/>
_2.2 Hello Controller 테스트 코드 작성하기<br/>
_2.3 롬복 소개 및 설치하기<br/>
_2.4 Hello Controller 코드를 롬복으로 전환하기<br/>
<br/><br/>
03장 스프링 부트에서 JPA로 데이터베이스 다뤄보자<br/>
_3.1 JPA 소개<br/>
__Spring Data JPA<br/>
__실무에서 JPA<br/>
__요구사항 분석<br/>
_3.2 프로젝트에 Spring Data Jpa 적용하기<br/>
_3.3 Spring Data JPA 테스트 코드 작성하기<br/>
_3.4 등록/수정/조회 API 만들기<br/>
_3.5 JPA Auditing으로 생성시간/수정시간 자동화하기<br/>
__LocalDate 사용<br/>
__JPA Auditing 테스트 코드 작성하기<br/>
<br/><br/>
04장 머스테치로 화면 구성하기<br/>
_4.1 서버 템플릿 엔진과 머스테치 소개<br/>
__머스테치란<br/>
__머스테치 플러그인 설치<br/>
_4.2 기본 페이지 만들기<br/>
_4.3 게시글 등록 화면 만들기<br/>
_4.4 전체 조회 화면 만들기<br/>
_4.5 게시글 수정, 삭제 화면 만들기<br/>
__게시글 수정<br/>
__게시글 삭제<br/>
<br/><br/>
05장 스프링 시큐리티와 OAuth 2.0으로 로그인 기능 구현하기<br/>
_5.1 스프링 시큐리티와 스프링 시큐리티 Oauth2 클라이언트<br/>
_5.2 구글 서비스 등록<br/>
_5.3 구글 로그인 연동하기<br/>
__스프링 시큐리티 설정<br/>
__로그인 테스트<br/>
_5.4 어노테이션 기반으로 개선하기<br/>
_5.5 세션 저장소로 데이터베이스 사용하기<br/>
_5.6 네이버 로그인<br/>
__네이버 API 등록<br/>
__스프링 시큐리티 설정 등록<br/>
_5.7 기존 테스트에 시큐리티 적용하기<br/>
<br/><br/>
06장 AWS 서버 환경을 만들어보자 - AWS EC2<br/>
_6.1 AWS 회원 가입<br/>
_6.2 EC2 인스턴스 생성하기<br/>
_6.3 EC2 서버에 접속하기<br/>
_6.4 아마존 리눅스 1 서버 생성 시 꼭 해야 할 설정들<br/>
<br/><br/>
07장 AWS에 데이터베이스 환경을 만들어보자 - AWS RDS<br/>
_7.1 RDS 인스턴스 생성하기<br/>
_7.2 RDS 운영환경에 맞는 파라미터 설정하기<br/>
_7.3 내 PC에서 RDS에서 접속해 보기<br/>
__Database 플러그인 설치<br/>
_7.4 EC2에서 RDS에서 접근 확인<br/>
<br/><br/>
08장 EC2 서버에 프로젝트를 배포해 보자<br/>
_8.1 EC2에 프로젝트 Clone 받기<br/>
_8.2 배포 스크립트 만들기<br/>
_8.3 외부 Security 파일 등록하기<br/>
_8.4 스프링 부트 프로젝트로 RDS 접근하기<br/>
__RDS 테이블 생성<br/>
__프로젝트 설정<br/>
__EC2 설정<br/>
_8.5 EC2에서 소셜 로그인하기<br/>
<br/><br/>
09장 코드가 푸시되면 자동으로 배포해 보자 - Travis CI 배포 자동화<br/>
_9.1 CI & CD 소개<br/>
_9.2 Travis CI 연동하기<br/>
__Travis CI 웹 서비스 설정<br/>
__프로젝트 설정<br/>
_9.3 Travis CI와 AWS S3 연동하기<br/>
__AWS Key 발급<br/>
__Travis CI에 키 등록<br/>
__S3 버킷 생성<br/>
__.travis.yml 추가<br/>
_9.4 Travis CI와 AWS S3, CodeDeploy 연동하기<br/>
__EC2에 IAM 역할 추가하기<br/>
__CodeDeploy 에이전트 설치<br/>
__CodeDeploy를 위한 권한 생성<br/>
__CodeDeploy 생성<br/>
__Travis CI, S3, CodeDeploy 연동<br/>
_9.5 배포 자동화 구성<br/>
__deploy.sh 파일 추가<br/>
__.travis.yml 파일 수정<br/>
__appspec.yml 파일 수정<br/>
__실제 배포 과정 체험<br/>
_9.6 CodeDeploy 로그 확인<br/>
<br/><br/>
10장 24시간 365일 중단 없는 서비스를 만들자<br/>
_10.1 무중단 배포 소개<br/>
_10.2 엔진엑스 설치와 스프링 부트 연동하기<br/>
_10.3 무중단 배포 스크립트 만들기<br/>
__profile API 추가<br/>
__real1, real2 profile 생성<br/>
__엔진엑스 설정 수정<br/>
__배포 스크립트들 작성<br/>
_10.4 무중단 배포 테스트<br/>
<br/><br/>
11장 1인 개발 시 도움이 될 도구와 조언들<br/>
_11.1 추천 도구 소개<br/>
__댓글<br/>
__외부 서비스 연동<br/>
__방문자 분석<br/>
__CDN<br/>
__이메일 마케팅<br/>
_11.2 1인 개발 팁<br/>
_11.3 마무리<br/>
