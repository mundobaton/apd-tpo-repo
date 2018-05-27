package edu.uade.apd.tpo.repository.stub;

import java.util.List;

public class StockStub extends BaseStub{
    private Long id;
    private List<MovimientoStub> movimientos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<MovimientoStub> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<MovimientoStub> movimientos) {
        this.movimientos = movimientos;
    }
}
