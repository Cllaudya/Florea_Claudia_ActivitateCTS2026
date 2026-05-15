package cts.model;

public interface IComposite {
    void stergeNod(IComposite iComposite) throws Exception;
    void adaugaNod(IComposite iComposite) throws Exception;
    IComposite getNod(int index) throws Exception;
}
