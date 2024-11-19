package cn.sakura.thepitcosmetics.cosmetics.impl.kill;

import cn.charlotte.pit.util.item.ItemBuilder;
import cn.sakura.thepitcosmetics.cosmetics.AbstractEffect;
import cn.sakura.thepitcosmetics.util.PlayerUtil;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class TestKillEffect extends AbstractEffect {

    @Override
    public String getDisplayName() {
        return "TestEffect";
    }

    @Override
    public String getEffectInternalName() {
        return "testKillEffect";
    }

    @Override
    public ItemStack getIcon() {
        return new ItemBuilder(Material.BOW).shiny().build();
    }

    @Override
    public List<String> getLore() {
        List<String> lore = new ArrayList<>();
        lore.add("这是一个测试特效");

        return lore;
    }

    @Override
    public void handleShoot(Player shooter, Arrow arrow) {

    }

    @Override
    public void handleDeath(Player myself) {

    }

    @Override
    public void handleKill(Player target) {
        PlayerUtil.playThunderEffect(target.getLocation());
    }
}
