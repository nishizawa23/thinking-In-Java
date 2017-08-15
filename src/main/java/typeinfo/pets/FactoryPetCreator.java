//: typeinfo/RegisteredFactories.java
package typeinfo.pets; /* Added by Eclipse.py */
// Registering Class Factories in the base class.
import typeinfo.factory.*;
import typeinfo.pets.*;
import java.util.*;


class PetFactory {
        // Create a Class Factory for each specific type:
        public static class Factory
                implements typeinfo.factory.Factory<Pet> {
                public Pet create() {
                        return new Pet();
                }
        }
}

class DogFactory {
        public static class Factory
                implements typeinfo.factory.Factory<Dog> {
                public Dog create() {
                        return new Dog();
                }
        }
}

class CatFactory {
        public static class Factory
                implements typeinfo.factory.Factory<Cat> {
                public Cat create() {
                        return new Cat();
                }
        }
}

class RodentFactory {
        public static class Factory
                implements typeinfo.factory.Factory<Rodent> {
                public Rodent create() {
                        return new Rodent();
                }
        }
}

class MuttFactory {
        public static class Factory
                implements typeinfo.factory.Factory<Mutt> {
                public Mutt create() {
                        return new Mutt();
                }
        }
}

class PugFactory {
        public static class Factory
                implements typeinfo.factory.Factory<Pug> {
                public Pug create() {
                        return new Pug();
                }
        }
}

class EgyptianMauFactory {
        public static class Factory
                implements typeinfo.factory.Factory<EgyptianMau> {
                public EgyptianMau create() {
                        return new EgyptianMau();
                }
        }
}

class ManxFactory {
        public static class Factory
                implements typeinfo.factory.Factory<Manx> {
                public Manx create() {
                        return new Manx();
                }
        }
}

class CymricFactory {
        public static class Factory
                implements typeinfo.factory.Factory<Cymric> {
                public Cymric create() {
                        return new Cymric();
                }
        }
}
class RatFactory {
        public static class Factory
                implements typeinfo.factory.Factory<Rat> {
                public Rat create() {
                        return new Rat();
                }
        }
}
class MouseFactory {
        public static class Factory
                implements typeinfo.factory.Factory<Mouse> {
                public Mouse create() {
                        return new Mouse();
                }
        }
}
class HamsterFactory {
        public static class Factory
                implements typeinfo.factory.Factory<Hamster> {
                public Hamster create() {
                        return new Hamster();
                }
        }
}

class GebilFactory {
        public static class Factory
                implements typeinfo.factory.Factory<Gebil> {
                public Gebil create() {
                        return new Gebil();
                }
        }
}

public class FactoryPetCreator extends PetCreator {

        public List<Class<? extends Pet>> types(){
                return allTypes;
        }

        public static final List<Class<? extends Pet>> allTypes =
                Collections.unmodifiableList(Arrays.asList(
                                Pet.class, Dog.class, Cat.class,  Rodent.class,
                                Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
                                Cymric.class, Rat.class, Mouse.class, Hamster.class, Gebil.class));

        static List<Factory<? extends Pet>> partFactories =
                new ArrayList<Factory<? extends Pet>>();

        static {
                // Collections.addAll() gives an "unchecked generic
                // array creation ... for varargs parameter" warning.
                partFactories.add(new PetFactory.Factory());
                partFactories.add(new DogFactory.Factory());
                partFactories.add(new CatFactory.Factory());
                partFactories.add(new RodentFactory.Factory());
                partFactories.add(new MuttFactory.Factory());
                partFactories.add(new PugFactory.Factory());
                partFactories.add(new EgyptianMauFactory.Factory());
                partFactories.add(new ManxFactory.Factory());
                partFactories.add(new CymricFactory.Factory());
                partFactories.add(new RatFactory.Factory());
                partFactories.add(new MouseFactory.Factory());
                partFactories.add(new HamsterFactory.Factory());
                partFactories.add(new GebilFactory.Factory());
        }
        private static Random rand = new Random(47);

        public Pet randomPet() {
                int n = rand.nextInt(partFactories.size());
                return partFactories.get(n).create();
        }

        public ArrayList<Pet> arrayList(int size) {
                ArrayList <Pet> mList = new ArrayList <Pet>();
                Collections.addAll(mList, createArray(size));
                return mList;
        }
        public Pet[] createArray(int size) {
                Pet[] result = new Pet[size];
                for (int i = 0; i < size; i++)
                        result[i] = randomPet();
                return result;
        }

        public static void main(String[] args) {
                for (int i = 0; i < 10; i++)
                        System.out.println(new FactoryPetCreator().randomPet());
        }
}
