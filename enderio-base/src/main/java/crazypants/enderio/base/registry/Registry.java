package crazypants.enderio.base.registry;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import crazypants.enderio.base.conduit.registry.ConduitRegistry;
import crazypants.enderio.base.init.IModObject;
import net.minecraft.block.Block;

/**
 * Central registry dispatcher for sub mods.
 *
 */
public final class Registry {

  private Registry() {
  }

  public static void registerRecipeFile(@Nonnull String filename) {
    // ...
  }

  public static @Nullable Block getConduitBlock() {
    return ConduitRegistry.getConduitBlock();
  }

  public static void registerConduitBlock(@Nonnull IModObject.Registerable block) {
    ConduitRegistry.registerConduitBlock(block);
  }

}
