토끼와 거북이가 경주하는 이야기
1. 토끼는 출발, 도착, 잠들기를 할 수 있다.
2. 거북이는 출발, 도착, 마주침을 할 수 있다.
3. 토끼와 거북이는 동시에 출발한다.
4. 토끼와 거북이는 출발과 도착 사이에 임의의 사건을 만날 수 있다.
5. 토끼와 거북이는 출발 후 도착까지 일정 시간이 소요된다.
6. (4)와 (5)의 이유로 동물들은 도착하지 못할수도 있다.
7. 토끼와 거북이는 총 4회 경주를 한다.
8. 프로그램을 실행할 때 마다 하나의 경기 결과만 확인할 수 있다.

토끼가 수신할 수 있는 메세지
1. 출발
2. 도착
3. 잠들기

거북이가 수신할 수 있는 메세지
1. 출발
2. 도착
3. 마주침

----------------------------------------------------------------------------------------------------------

경마
        1. 말은 출발, 코너링, 직선(장거리 & 단거리), 도착을 할 수 있다.
            1-1. 각 말마다 성공/실패 확률이 존재하며 그 확률은 가중치에 따라 달라진다.
        2. 경마(본부)는 각 말들의 승리 확률을 갖고있으며, 말들은 그 값을 기반으로 사전 경기 기록을 갖는다.
        3. 마권은 경마의 승리 확률에 따라 배당율을 계산하며, 마권의 구입 및 결과를 처리한다.
        4. 세마리의 말은 동시에 출발한다.
        5. 경주는 1바퀴에 직선(단거리) / 코너 / 직선(장거리) / 코너 / 직선(단거리) 코스로 이루어진다.
            5-1. 각 코스마다 성공/실패 확률이 존재하며, 성공시 기록이 단축 / 실패시 기록이 증가 된다.
            5-2. 1바퀴마다 중간 결과가 공지된다.
            5-3. 각 코스 입장시 이전 코스까지의 기록에 따라 안내(출력)되는 순서가 달라진다.
        6. 마권은 경주 시작 전 구매 여부를 통해 결정할 수 있으며, 경마가 끝난 후 기록에 따라 결과가 달라진다.
            6-1. 마권 구매시 각 말의 승률과 배당이 공개된다.
            6-2. 마권 구매시 승리할것으로 예측되는 말과 베팅 금액을 정할 수 있다.
            6-3. 마권을 구매한 경우 경마가 끝나면 기록에 따라 다른 결과가 안내(출력)된다.

        말이 수신할 수 있는 메세지
        1. 출발
        2. 코너
        3. 직선
            3-1. 장거리
            3-2. 단거리
        4. 도착

        경마(본부)가 수신할 수 있는 메세지
        1. 말들의 승률 계산
        2. 경마의 시작

        마권이 수신할 수 있는 메세지
        1. 마권 구매
        2. 마권 결과
