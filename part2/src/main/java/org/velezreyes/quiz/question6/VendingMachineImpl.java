package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {
  private static VendingMachine instance = null;
  private boolean hasQuarter;

  public VendingMachineImpl() {
    this.hasQuarter = false;
  }

  public static VendingMachine getInstance() {
    if (instance == null) {
      instance = new VendingMachineImpl();
    }
    return instance;
  }

  @Override
  public void insertQuarter() {
    this.hasQuarter = true;
  } 

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    if (!hasQuarter) {
      throw new NotEnoughMoneyException();
    }

    if (name.equals("Pepsi")) {
      return new Drink() {
        @Override
        public String getName() {
          return "Pepsi";
        }

        @Override
        public boolean isFizzy() {
          return true;
        }
      };
    } else if (name.equals("Coca-Cola")) {
      return new Drink() {
        @Override
        public String getName() {
          return "Coca-Cola";
        }

        @Override
        public boolean isFizzy() {
          return true;
        }
      };
    } else {
      throw new UnknownDrinkException();
    }
  }
}