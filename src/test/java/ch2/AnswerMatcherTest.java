package ch2;

class AnswerMatcherTest {
    private AnswerMatcher answerMatcher = new AnswerMatcher(new Score());

//    @Test
//    @DisplayName("정답과 입력이 완전히 다르다면 0을 반환한다.")
//    void returnZeroWhenNotCorrect() {
//        assertThat(answerMatcher.compare("123", "456")).isEqualTo(0);
//    }
//
//    @Test
//    @DisplayName("정답과 입력이 완전히 일치한다면 3을 반환한다.")
//    void returnThreeWhenThreeCorrect() {
//        assertThat(answerMatcher.compare("123", "123")).isEqualTo(3);
//    }
//
//    @Test
//    @DisplayName("숫자는 같아도 위치가 다를경우 0을 반환한다.")
//    void returnZeroWhenPostureNotCorrect() {
//        assertThat(answerMatcher.compare("123", "312")).isEqualTo(0);
//    }
}