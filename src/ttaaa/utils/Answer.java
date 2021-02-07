package ttaaa.utils;

public abstract class Answer<T extends Problem> implements Generated<Answer<T>> {
    @Override
    abstract public Answer<T> generate(int intKey);
}