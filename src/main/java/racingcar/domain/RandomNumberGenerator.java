package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator {

    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 9;

    public int generateRandomNumber() {
        return Randoms.pickNumberInRange(MIN_RANGE,MAX_RANGE);
    }
}