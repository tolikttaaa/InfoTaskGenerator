package ttaaa.utils;

import java.util.Date;

public interface Generated<T> {
    int DEFAULT_KEY = 123;

    T generate(int intKey);

    default T generate() {
        return generate(DEFAULT_KEY);
    }

    default T generate(Date dateKey) {
        return generate(date2Int(dateKey));
    }

    default T generate(String stringKey) {
        return generate(string2Int(stringKey));
    }

    static int date2Int(Date date) {
        return date.hashCode();
    }

    static int string2Int(String str) {
        return str.hashCode();
    }
}
