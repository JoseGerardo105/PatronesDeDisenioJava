package main;

public interface IVisitor {
    
    float visit(IFruta fruta);

    float visit(ILineaBlanca lineaBlanca);
}
