package exercise.chpater_37;

public interface FamilyRole extends DaddyRole, HusbandRole{
    @Override
    default void sayLoveEveryDay() {
        DaddyRole.super.sayLoveEveryDay();
        HusbandRole.super.sayLoveEveryDay();
    }
}
