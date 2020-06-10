package com.readyhuihui.designpatterndemo.behavior.absfactory;

/**
 * @Author:lyh
 * @Description:
 * @Date:Created in 2020/6/3 22:42
 */
public interface CarFactroy {
    Engine getEngine();

    Seat getSeat();

    Tyre getTyre();
}

class LuxuryFactory implements CarFactroy {
    @Override
    public Engine getEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat getSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre getTyre() {
        return new LuxuryTyre();
    }
}

class LowCarFactory implements CarFactroy {

    @Override
    public Engine getEngine() {
        return new LowEngine();
    }

    @Override
    public Seat getSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre getTyre() {
        return new LowTyre();
    }
}
