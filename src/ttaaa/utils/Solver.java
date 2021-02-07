package ttaaa.utils;

public abstract class Solver<T extends Problem> {
    public abstract Solution<T> solve(T problem);
}
