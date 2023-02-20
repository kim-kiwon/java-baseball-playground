
## 기능 목록
- [ ] Application에서 사용자의 입력을 받는다
- [ ] 하나의 게임을 진행한다 List<enum> 반환 Baseball#play
- [ ] 1부터 9까지의 서로 다른 임의의 수 3개를 생성한다. - AnswerGenerator#makeAnswer
- [ ] 컴퓨터의 수(3자리)와 플레이어의 수(3자리)를 비교할 수 있다.(결과는 List<enum>으로 반환) - AnswerComparer#compare
  - [ ] 몇 개의 숫자가 같은지 알 수 있다 - Referee#check 
    - 같은 수가 같은 위치에 있다면 스트라이크
    - 같은 수가 다른 위치에 있다면 볼
- [ ] Application에서 List<enum>으로 뷰를 생성한다