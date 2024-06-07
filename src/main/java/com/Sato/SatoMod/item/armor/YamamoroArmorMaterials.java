package com.Sato.SatoMod.item.armor;

import java.util.EnumMap;
import java.util.function.Supplier;

import com.Sato.SatoMod.main.SatoMod;
import com.Sato.SatoMod.regi.SatoModItems;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;


public enum YamamoroArmorMaterials implements StringRepresentable, ArmorMaterial {

//    名前: "yamamoto_ingot"
//    耐久値の乗算: 20
//    防御値: ブーツが3、レギンスが6、チェストプレートが8、ヘルメットが3
//    エンチャントのしやすさ: 15
//    装備時の音: ネザライト防具の装備音
//    タフネス: 3.0
//    ノックバック耐性: 0.1
//    修理材料: SatoModItems.YAMAMOTO_INGOT
    YAMAMOTO_INGOT("yamamoto_ingot", 20, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (p_266655_) -> {
        p_266655_.put(Type.BOOTS, 3);
        p_266655_.put(Type.LEGGINGS, 5);
        p_266655_.put(Type.CHESTPLATE, 7);
        p_266655_.put(Type.HELMET, 2);
    }), 30, SoundEvents.ARMOR_EQUIP_NETHERITE, 2.0F, 0.2F, () -> {
        return Ingredient.of(new ItemLike[]{SatoModItems.YAMAMOTO_INGOT.get()});
    });

    public static final StringRepresentable.EnumCodec<ArmorMaterials> CODEC = StringRepresentable.fromEnum(ArmorMaterials::values);
    private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (p_266653_) -> {
        p_266653_.put(Type.BOOTS, 13);
        p_266653_.put(Type.LEGGINGS, 15);
        p_266653_.put(Type.CHESTPLATE, 16);
        p_266653_.put(Type.HELMET, 11);
    });
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private YamamoroArmorMaterials(String p_268171_, int p_268303_, EnumMap p_267941_, int p_268086_, SoundEvent p_268145_, float p_268058_, float p_268180_, Supplier p_268256_) {
        this.name = p_268171_;
        this.durabilityMultiplier = p_268303_;
        this.protectionFunctionForType = p_267941_;
        this.enchantmentValue = p_268086_;
        this.sound = p_268145_;
        this.toughness = p_268058_;
        this.knockbackResistance = p_268180_;
        this.repairIngredient = new LazyLoadedValue(p_268256_);
    }

    public int getDurabilityForType(ArmorItem.Type p_266745_) {
        return (Integer)HEALTH_FUNCTION_FOR_TYPE.get(p_266745_) * this.durabilityMultiplier;
    }

    public int getDefenseForType(ArmorItem.Type p_266752_) {
        return (Integer)this.protectionFunctionForType.get(p_266752_);
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public String getSerializedName() {
        return this.name;
    }

}
