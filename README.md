# java-lotto
로또 미션 진행을 위한 저장소

## 기능 목록
#### 구입금액을 입력받는다.
 ```
  예외처리)
   - 숫자가 아닌 경우
   - 1000원 미만의 금액인 경우
   - 공백(null)인 경우
 ```

#### 구입금액으로부터 발급 가능한 매수 만큼 자동 발급한다.

 - 로또 한장은 1000원이다.
 - 각 로또의 번호는 랜덤으로 6개를 발급한다.
 - 로또의 번호는 1~45의 숫자로 이루어져있다.
 - 로또의 번호는 오름차순으로 정렬되어있다.
 ```
  예외처리)
    - 중복된 숫자가 하나의 로또에 발급된 경우
 ```

#### 발급한 로또들을 출력한다.

 - 각 로또는 []로 감싸져 있고, 번호는 쉼표+공백(,)으로 구분한다.

#### 지난주 당첨번호와 보너스 볼을 입력받는다.

 - 지난주 당첨번호 6개를 입력받는다.
 - 당첨 번호는 ", "으로 구분한다.
 - 보너스 볼은 하나의 숫자를 입력받는다
  ```
   예외처리)
     - 숫자가 아닌 경우
     - 로또 숫자가 아닌 경우
     - 공백(null)인 경우
     - 숫자가 중복된 경우
     - 보너스볼의 숫자가 당첨번호와 중복되는 경우
  ```

#### 당첨 통계와 수익률을 출력한다.

 - 구매한 로또들과 당첨번호를 비교해서 등수를 계산한다.
 - 당첨금액/구매금액으로 수익률을 계산한다.
 - 각 등수별 당첨된 로또 개수와 최종 수익률을 출력한다.
