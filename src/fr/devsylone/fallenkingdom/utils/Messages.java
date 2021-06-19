package fr.devsylone.fallenkingdom.utils;

import org.bukkit.command.CommandSender;

import java.text.ChoiceFormat;
import java.util.Arrays;

public enum Messages
{
    BROADCAST_CHEST_ROOM_CAPTURED("broadcast.chest-room.captured"),
    BROADCAST_CHEST_ROOM_TITLE("broadcast.chest-room.title"),
    BROADCAST_CHEST_ROOM_SUBTITLE("broadcast.chest-room.subtitle"),
    BROADCAST_DAY("broadcast.day"),
    BROADCAST_DAY_ASSAULT("broadcast.day.assault"),
    BROADCAST_DAY_CHEST("broadcast.day.chest"),
    BROADCAST_DAY_END("broadcast.day.end"),
    BROADCAST_DAY_NETHER("broadcast.day.nether"),
    BROADCAST_DAY_PVP("broadcast.day.pvp"),
    BROADCAST_LOCKED_CHEST_ABORT("broadcast.locked-chest.abort"),
    BROADCAST_LOCKED_CHEST_START("broadcast.locked-chest.start"),
    BROADCAST_LOCKED_CHEST_UNLOCKED("broadcast.locked-chest.unlocked"),
    BROADCAST_PLAYER_ELIMINATED("broadcast.player.eliminated"),
    BROADCAST_PREGAME_RULES("broadcast.pregame.rules"),
    BROADCAST_PREGAME_START("broadcast.pregame.start"),
    BROADCAST_PREGAME_TEAMS("broadcast.pregame.teams"),
    BROADCAST_PREGAME_TP("broadcast.pregame.tp"),
    BROADCAST_START("broadcast.start"),
    BROADCAST_SUN_WILL_RISE("broadcast.sun-will-rise"),
    BROADCAST_VICTORY_TITLE("broadcast.victory.title"),
    BROADCAST_VICTORY_SUBTITLE("broadcast.victory.subtitle"),

    CHAT_GLOBAL("chat.global"),
    CHAT_JOIN("chat.join"),
    CHAT_QUIT("chat.quit"),
    CHAT_TEAM("chat.team"),

    CMD_BASE_UNLOADED("cmd.base.unloaded"),

    CMD_ERROR("cmd.error.unknown"),
    CMD_ERROR_UNKNOWN("cmd.error.unknown-cmd"),
    CMD_ERROR_UNKNOWN_ARG("cmd.error.unknown-arg"),
    CMD_ERROR_ALREADY_IN_PAUSE("cmd.error.already-in-pause"),
    CMD_ERROR_BOOL_FORMAT("cmd.error.format.bool"),
    CMD_ERROR_CHAT_CHAR_FORMAT("cmd.error.format.chat-char"),
    CMD_ERROR_PERCENTAGE_FORMAT("cmd.error.format.percentage"),
    CMD_ERROR_CAP_PASSED("cmd.error.rules.cap.passed"),
    CMD_ERROR_CHEST_ROOM_CAPTURE_TIME_FORMAT("cmd.error.team.chestRoom.captureTime-format"),
    CMD_ERROR_CHEST_ROOM_DISABLED("cmd.error.team.chestRoom.show.disabled"),
    CMD_ERROR_CHEST_ROOM_INVALID_OFFSET("cmd.error.team.chestRoom.offset.not-valid"),
    CMD_ERROR_CHEST_ROOM_INVALID_TIME("cmd.error.team.chestRoom.show.time"),
    CMD_ERROR_CHEST_ROOM_NONE("cmd.error.team.chestRoom.show.none"),
    CMD_ERROR_NO_CHEST_ROOM("cmd.error.no-chestRoom"),
    CMD_ERROR_CHEST_ROOM_STARTED("cmd.error.team.chestRoom.edit.started"),
    CMD_ERROR_DAY_FORMAT("cmd.error.format.day"),
    CMD_ERROR_DAY_DURATION_FORMAT("cmd.error.format.day-duration"),
    CMD_ERROR_DAY_PASSED("cmd.error.rules.day.passed"),
    CMD_ERROR_GAME_ALREADY_STARTED("cmd.game.already-started"),
    CMD_ERROR_GAME_NOT_STARTED("cmd.game.not-started"),

    CMD_ERROR_INVALID_PLAYER("cmd.error.invalid.player"),
    CMD_ERROR_MUST_BE_PLAYER("cmd.error.must-be-player"),
    CMD_ERROR_NAN("cmd.error.format.not-a-number"),
    CMD_ERROR_EMPTY_CHESTS_LIST("cmd.error.chests.empty-list"),
    CMD_ERROR_NOT_CHEST("cmd.error.chests.look-at-chest"),
    CMD_ERROR_NOT_IN_PAUSE("cmd.error.not-in-pause"),
    CMD_ERROR_NOT_LOCKED_CHEST("cmd.error.chests.look-at-locked-chest"),
    CMD_ERROR_NO_PERMISSION("cmd.error.no-permission"),
    CMD_ERROR_NOT_AFFECTED_WORLD("cmd.error.not-affected-world"),
    CMD_ERROR_NO_TEAM("cmd.error.team.no-team"),
    CMD_ERROR_PAUSE_ID("cmd.error.format.pause-id"),
    CMD_ERROR_PLAYER_ALREADY_HAS_TEAM("cmd.error.team.already-has-team"),
    CMD_ERROR_PLAYER_NOT_IN_TEAM("cmd.error.team.not-in-team"),
    CMD_ERROR_POSITIVE_INT("cmd.error.format.positive-int"),
    CMD_ERROR_RADIUS_FORMAT("cmd.error.format.radius"),
    CMD_ERROR_RULES_ALREADY_DEFINED("cmd.error.rules.already-defined"),
    CMD_ERROR_SCOREBOARD_CANNOT_UNDO("cmd.error.scoreboard.cannot-undo"),
    CMD_ERROR_SCOREBOARD_BEING_LEARN_EDIT("cmd.error.scoreboard.learn"),
    CMD_ERROR_SCOREBOARD_INVALID_LINE("cmd.error.scoreboard.invalid-line"),
    CMD_ERROR_SCOREBOARD_TOO_MANY_CHARS("cmd.error.scoreboard.too-many-chars"),
    CMD_ERROR_SCOREBOARD_TITLE_TOO_LONG("cmd.error.scoreboard.title-too-long"),
    CMD_ERROR_SCOREBOARD_ALREADY_EDITING("cmd.error.scoreboard.already-editing"),
    CMD_ERROR_SCOREBOARD_NOT_EDITING("cmd.error.scoreboard.not.editing"),
    CMD_ERROR_STARTER_INV_CANNOT_UNDO("cmd.error.game.starterInv.cannot-undo"),
    CMD_ERROR_TEAM_ALREADY_EXIST("cmd.error.team.already-exist"),
    CMD_ERROR_TEAM_INVALID_NAME("cmd.error.team.invalid-name"),
    CMD_ERROR_TEAM_NAME_TOO_LONG("cmd.error.team.name-too-long"),
    CMD_ERROR_TIME_FORMAT("cmd.error.format.time"),
    CMD_ERROR_UNKNOWN_BLOCK("cmd.error.unknown.block"),
    CMD_ERROR_UNKNOWN_TEAM("cmd.error.unknown.team"),
    CMD_ERROR_LANG_SET_LANG_LANG_NOT_FOUND("cmd.error.lang.setLang.lang-not-found"),

    CMD_GAME_PAUSE("cmd.game.pause"),
    CMD_GAME_PAUSE_ID("cmd.game.pause.id"),
    CMD_GAME_PAUSE_RESTORE_INVITE("cmd.game.pause.restore-invite"),
    CMD_GAME_PAUSE_SAVE_INFO("cmd.game.pause.save-info"),
    CMD_GAME_RESET("cmd.game.reset"),
    CMD_GAME_RESTORE("cmd.game.restore"),
    CMD_GAME_RESTORE_INVALID_ID("cmd.game.restore.invalid-id"),
    CMD_GAME_RESTORE_DISCONNECTED_PLAYERS("cmd.game.restore.disconnected-players"),
    CMD_GAME_RESUME("cmd.game.resume"),
    CMD_GAME_STARTER_INV_CANCEL("cmd.game.starterInv.cancel"),
    CMD_GAME_STARTER_INV_SAVED("cmd.game.starterInv.saved"),
    CMD_GAME_STARTER_INV_UNDO("cmd.game.starterInv.undo"),
    CMD_GAME_STOP("cmd.game.stop"),

    CMD_LANG_SET("cmd.lang.set"),
    CMD_LANG_TRY_LOAD("cmd.lang.tryLoad"),
    CMD_LANG_TRY_LOAD_MISSING("cmd.lang.tryLoad.missing"),

    CMD_LOCKED_CHEST_CREATED("cmd.chests.created"),
    CMD_LOCKED_CHEST_LIST_INFO("cmd.chests.list.info"),
    CMD_LOCKED_CHEST_LIST_POSITION("cmd.chests.list.position"),
    CMD_LOCKED_CHEST_LOCKED("cmd.chests.locked"),
    CMD_LOCKED_CHEST_REMOVED("cmd.chests.removed"),
    CMD_LOCKED_CHEST_UNLOCKED("cmd.chests.unlocked"),

    CMD_MAP_BUG("cmd.map.bug"),
    CMD_MAP_BUG_BUG("cmd.map.bug.bug"),

    CMD_MAP_CHEST("cmd.map.chests"),
    CMD_MAP_CHEST_ADD("cmd.map.chests.add"),
    CMD_MAP_CHEST_LIST("cmd.map.chests.list"),
    CMD_MAP_CHEST_LOCK("cmd.map.chests.lock"),
    CMD_MAP_CHEST_REMOVE("cmd.map.chests.remove"),
    CMD_MAP_CHEST_UNLOCK("cmd.map.chests.unlock"),

    CMD_MAP_GAME("cmd.map.game"),
    CMD_MAP_GAME_PAUSE("cmd.map.game.pause"),
    CMD_MAP_GAME_RESET("cmd.map.game.reset"),
    CMD_MAP_GAME_RESTORE("cmd.map.game.restore"),
    CMD_MAP_GAME_RESUME("cmd.map.game.resume"),
    CMD_MAP_GAME_START("cmd.map.game.start"),
    CMD_MAP_GAME_STARTER_INV("cmd.map.game.starterInv"),
    CMD_MAP_GAME_STARTER_INV_INVENTORY("cmd.map.game.starterInv.inventory"),
    CMD_MAP_GAME_STOP("cmd.map.game.stop"),

    CMD_MAP_LANG("cmd.map.lang"),
    CMD_MAP_LANG_SET("cmd.map.lang.set"),
    CMD_MAP_LANG_TRY_LOAD("cmd.map.lang.tryLoad"),

    CMD_MAP_RULES("cmd.map.rules"),
    CMD_MAP_RULES_ALLOW_BLOCK("cmd.map.rules.allowBlock"),
    CMD_MAP_RULES_ALLOW_BLOCK_SIGN("cmd.map.rules.allow-block.allowed.all-types.sign"),
    CMD_MAP_RULES_CAPTURE_RATE("cmd.map.rules.captureRate"),
    CMD_MAP_RULES_CHARGED_CREEPERS("cmd.map.rules.chargedCreepers"),
    CMD_MAP_RULES_CHEST_LIMIT("cmd.map.rules.chestLimit"),
    CMD_MAP_RULES_DAY_DURATION("cmd.map.rules.dayDuration"),
    CMD_MAP_RULES_DEATH_LIMIT("cmd.map.rules.deathLimit"),
    CMD_MAP_RULES_DEEP_PAUSE("cmd.map.rules.deepPause"),
    CMD_MAP_RULES_DENY_BLOCK("cmd.map.rules.denyBlock"),
    CMD_MAP_RULES_DISABLED_POTIONS("cmd.map.rules.disabledPotions"),
    CMD_MAP_RULES_DO_PAUSE_AFTER_DAY("cmd.map.rules.doPauseAfterDay"),
    CMD_MAP_RULES_ENDERPEARL_ASSAULT("cmd.map.rules.enderpearlAssault"),
    CMD_MAP_RULES_END_CAP("cmd.map.rules.endCap"),
    CMD_MAP_RULES_ETERNAL_DAY("cmd.map.rules.eternalDay"),
    CMD_MAP_RULES_FRIENDLY_FIRE("cmd.map.rules.friendlyFire"),
    CMD_MAP_RULES_HEALTH_BELOW_NAME("cmd.map.rules.healthBelowName"),
    CMD_MAP_RULES_LIST("cmd.map.rules.list"),
    CMD_MAP_RULES_NETHER_CAP("cmd.map.rules.netherCap"),
    CMD_MAP_RULES_PLACE_BLOCK_IN_CAVE("cmd.map.rules.placeBlockInCave"),
    CMD_MAP_RULES_PVP_CAP("cmd.map.rules.pvpCap"),
    CMD_MAP_RULES_RESPAWN_AT_HOME("cmd.map.rules.respawnAtHome"),
    CMD_MAP_RULES_TNT_CAP("cmd.map.rules.tntCap"),
    CMD_MAP_RULES_TNT_JUMP("cmd.map.rules.tntJump"),
    CMD_MAP_RULES_GLOBAL_CHAT_PREFIX("cmd.map.rules.globalChatPrefix"),

    CMD_MAP_SCOREBOARD("cmd.map.scoreboard"),
    CMD_MAP_SCOREBOARD_EDIT("cmd.map.scoreboard.edit"),
    CMD_MAP_SCOREBOARD_LEAVE_EDIT("cmd.map.scoreboard.leaveEdit"),
    CMD_MAP_SCOREBOARD_REMOVE_LINE("cmd.map.scoreboard.removeLine"),
    CMD_MAP_SCOREBOARD_RESET("cmd.map.scoreboard.reset"),
    CMD_MAP_SCOREBOARD_SET_LINE("cmd.map.scoreboard.setLine"),
    CMD_MAP_SCOREBOARD_SET_NAME("cmd.map.scoreboard.setName"),
    CMD_MAP_SCOREBOARD_UNDO("cmd.map.scoreboard.undo"),

    CMD_MAP_SCOREBOARD_DISPLAYER_EDIT_LINE("cmd.map.scoreboard.displayer.edit-line"),
    CMD_MAP_SCOREBOARD_DISPLAYER_USE_WHEEL("cmd.map.scoreboard.displayer.use-wheel"),
    CMD_MAP_SCOREBOARD_DISPLAYER_LOOK_SCOREBOARD("cmd.map.scoreboard.displayer.look-scoreboard"),
    CMD_MAP_SCOREBOARD_DISPLAYER_VARIABLES("cmd.map.scoreboard.displayer.variables"),
    CMD_MAP_SCOREBOARD_DISPLAYER_LEAVE_EDIT("cmd.map.scoreboard.displayer.leave-edit"),

    CMD_SCOREBOARD_NO_TEAM("cmd.scoreboard.no-team"),
    CMD_SCOREBOARD_NO_BASE("cmd.scoreboard.no-base"),

    CMD_MAP_TEAM("cmd.map.team"),
    CMD_MAP_TEAM_ADD_PLAYER("cmd.map.team.addPlayer"),
    CMD_MAP_CHEST_ROOM("cmd.map.team.chestRoom"),
    CMD_MAP_CHEST_ROOM_CAPTURE("cmd.map.team.chestRoom.capture"),
    CMD_MAP_CHEST_ROOM_ENABLED("cmd.map.team.chestRoom.enabled"),
    CMD_MAP_CHEST_ROOM_OFFSET("cmd.map.team.chestRoom.offset"),
    CMD_MAP_CHEST_ROOM_SHOW("cmd.map.team.chestRoom.show"),
    CMD_MAP_TEAM_CREATE("cmd.map.team.create"),
    CMD_MAP_TEAM_LIST("cmd.map.team.list"),
    CMD_MAP_TEAM_RANDOM("cmd.map.team.random"),
    CMD_MAP_TEAM_REMOVE("cmd.map.team.remove"),
    CMD_MAP_TEAM_REMOVE_PLAYER("cmd.map.team.removePlayer"),
    CMD_MAP_TEAM_SET_BASE("cmd.map.team.setBase"),
    CMD_MAP_TEAM_SET_COLOR("cmd.map.team.setColor"),
    CMD_MAP_TEAM_TP("cmd.map.team.tp"),

    CMD_RULES_ACTIVATED("cmd.rules.activated"),
    CMD_RULES_ALLOW_BLOCK("cmd.rules.allow-block.allowed"),
    CMD_RULES_ENDER_EYE_MSG("cmd.rules.ender-eye-msg"),
    CMD_RULES_BLOCK_CAVE_ACTIVE("cmd.rules.placeBlockInCave.active"),
    CMD_RULES_BLOCK_CAVE_CONSECUTIVE("cmd.rules.placeBlockInCave.consecutive"),
    CMD_RULES_BLOCK_CAVE_INACTIVE("cmd.rules.placeBlockInCave.inactive"),
    CMD_RULES_BLOCK_CAVE_INFO("cmd.rules.placeBlockInCave.info"),
    CMD_RULES_BLOCK_CAVE_INFO_ALLOWED_BLOCKS("cmd.rules.placeBlockInCave.info.allowedBlocks"),
    CMD_RULES_BLOCK_CAVE_INFO_ENEMY("cmd.rules.placeBlockInCave.info.enemy"),
    CMD_RULES_BLOCK_CAVE_INFO_MODIFIABLE("cmd.rules.placeBlockInCave.info.modifiable"),
    CMD_RULES_BLOCK_CAVE_INFO_TNT("cmd.rules.placeBlockInCave.info.tnt"),
    CMD_RULES_BLOCK_CAVE_MORE_INFO("cmd.rules.placeBlockInCave.more-info"),
    CMD_RULES_CAP("cmd.rules.cap"),
    CMD_RULES_CAP_END("cmd.rules.cap.end"),
    CMD_RULES_CAP_FROM_DAY("cmd.rules.cap.from-day"),
    CMD_RULES_CAP_FROM_DAY_1("cmd.rules.cap.from-day.1"),
    CMD_RULES_CAP_NETHER("cmd.rules.cap.nether"),
    CMD_RULES_CAP_PVP("cmd.rules.cap.pvp"),
    CMD_RULES_CAP_TNT("cmd.rules.cap.tnt"),
    CMD_RULES_CAPTURE_RATE_SET("cmd.rules.capture-rate.set"),
    CMD_RULES_CHARGED_CREEPERS_DROP_RATE("cmd.rules.charged-creepers.drop-rate"),
    CMD_RULES_CHARGED_CREEPERS_SPAWN_RATE("cmd.rules.charged-creepers.spawn-rate"),
    CMD_RULES_CHEST_LIMIT_FIXED("cmd.rules.chest-limit.fixed"),
    CMD_RULES_CHEST_LIMIT_REMOVED("cmd.rules.chest-limit.removed"),
    CMD_RULES_DAY_DURATION("cmd.rules.day-duration"),
    CMD_RULES_DEACTIVATED("cmd.rules.deactivated"),
    CMD_RULES_DEATH_LIMIT_FIXED("cmd.rules.death-limit.fixed"),
    CMD_RULES_DEATH_LIMIT_REMOVED("cmd.rules.death-limit.removed"),
    CMD_RULES_DEATH_LIMIT_RESET("cmd.rules.death-limit.reset"),
    CMD_RULES_DEEP_PAUSE("cmd.rules.deep-pause"),
    CMD_RULES_DEEP_PAUSE_IN_DEPTH("cmd.rules.deep-pause.in-depth"),
    CMD_RULES_DEEP_PAUSE_LIGHT("cmd.rules.deep-pause.light"),
    CMD_RULES_DENY_BLOCK("cmd.rules.allow-block.denied"),
    CMD_RULES_DO_PAUSE_AFTER_DAY("cmd.rules.do-pause-after-day"),
    CMD_RULES_ERROR_ALREADY_ALLOWED("cmd.rules.allow-block.already-allowed"),
    CMD_RULES_ERROR_ALREADY_DENIED("cmd.rules.allow-block.already-denied"),
    CMD_RULES_ENDERPEARL_ASSAULT("cmd.rules.enderpearl-assault"),
    CMD_RULES_ETERNAL_DAY("cmd.rules.eternal-day"),
    CMD_RULES_FRIENDLY_FIRE("cmd.rules.friendly-fire"),
    CMD_RULES_GLOBAL_CHAT_PREFIX_SET("cmd.rules.global-chat-prefix.set"),
    CMD_RULES_GLOBAL_CHAT_PREFIX_UNSET("cmd.rules.global-chat-prefix.unset"),
    CMD_RULES_HEALTH_BELOW_NAME_HIDDEN("cmd.rules.health-below-name.hidden"),
    CMD_RULES_HEALTH_BELOW_NAME_VISIBLE("cmd.rules.health-below-name.visible"),
    CMD_RULES_IMPOSSIBLE("cmd.rules.impossible"),
    CMD_RULES_LIST("cmd.rules.list"),
    CMD_RULES_POSSIBLE("cmd.rules.possible"),
    CMD_RULES_RESPAWN_BASE("cmd.rules.respawn.base"),
    CMD_RULES_RESPAWN_VANILLA("cmd.rules.respawn.vanilla"),
    CMD_RULES_TNT_JUMP("cmd.rules.tnt-jump"),
    CMD_RULES_VERTICAL_LIMIT_REMOVED("cmd.rules.vertical-limit.removed"),
    CMD_RULES_VERTICAL_LIMIT_FIXED("cmd.rules.vertical-limit.fixed"),

    CMD_SCOREBOARD_RESET("cmd.scoreboard.reset"),
    CMD_TEAM_ADD_PLAYER("cmd.team.addPlayer"),
    CMD_TEAM_CHEST_ROOM_CAPTURE_TIME("cmd.team.chestRoom.captureTime"),
    CMD_TEAM_CHEST_ROOM_DISABLED("cmd.team.chestRoom.disabled"),
    CMD_TEAM_CHEST_ROOM_ENABLED("cmd.team.chestRoom.enabled"),
    CMD_TEAM_CHEST_ROOM_OFFSET("cmd.team.chestRoom.offset"),
    CMD_TEAM_CHEST_ROOM_SHOW("cmd.team.chestRoom.show"),
    CMD_TEAM_CREATE("cmd.team.create"),
    CMD_TEAM_LIST_PLAYERS("cmd.team.list.players"),
    CMD_TEAM_LIST_POSITION("cmd.team.list.position"),
    CMD_TEAM_RANDOM("cmd.team.random"),
    CMD_TEAM_REMOVE("cmd.team.remove"),
    CMD_TEAM_REMOVE_PLAYER("cmd.team.removePlayer"),
    CMD_TEAM_SET_BASE("cmd.team.setBase"),
    CMD_TEAM_SET_COLOR("cmd.team.setColor"),

    CMD_TEAMS_AND_CHESTS_LIST("cmd.teams.and.chests.list"),

    CMD_DEBUG_SUCCESS("cmd.debug-success"),
    CMD_DEBUG_ERROR("cmd.debug-error"),

    EASTER_EGG_CHEST_EXPLODE("easter-egg.chest-explode"),
    EASTER_EGG_ANNIVERSARY_NAME("easter-egg.anniversary-name"),
    EASTER_EGG_ANNIVERSARY_LORE_1("easter-egg.anniversary-lore-1"),
    EASTER_EGG_ANNIVERSARY_LORE_2("easter-egg.anniversary-lore-2"),
    EASTER_EGG_ANNIVERSARY_LORE_3("easter-egg.anniversary-lore-3"),

    INVENTORY_POTION_DISABLE("inv.potion.disable"),
    INVENTORY_POTION_DISABLE_CLICK("inv.potion.disable-click"),
    INVENTORY_POTION_ENABLE("inv.potion.enable"),
    INVENTORY_POTION_ENABLE_CLICK("inv.potion.enable-click"),
    INVENTORY_POTION_LEVEL_II("inv.potion.level-ii"),
    INVENTORY_POTION_TITLE("inv.potion.title"),
    INVENTORY_STARTER_TITLE("inv.starter.title"),

    PLAYER_BASE_ENTER("player.base.enter"),
    PLAYER_BASE_EXIT("player.base.exit"),
    PLAYER_BASE_OBSTRUCTED("player.base.obstructed"),
    PLAYER_BLOCK_BREAK_ENEMY("player.block.break-enemy"),
    PLAYER_BLOCK_BREAK_LOCKED("player.block.break-locked"),
    PLAYER_BLOCK_NOT_ALLOWED("player.block.not-allowed"),
    PLAYER_CHEST_ROOM_CAPTURE_INTERRUPTED("player.base.chest-room.capture.interrupted"),
    PLAYER_CHEST_ROOM_CAPTURE_STARTED("player.base.chest-room.capture.started"),
    PLAYER_CHEST_ROOM_ENTER("player.base.chest-room.enter"),
    PLAYER_CHEST_ROOM_EXIT("player.base.chest-room.exit"),
    PLAYER_CHEST_TOO_FAR("player.chest-room.too-far"),
    PLAYER_CREATIVE_CHAT("player.creative.chat"),
    PLAYER_CREATIVE_SUBTITLE("player.creative.subtitle"),
    PLAYER_CREATIVE_TITLE("player.creative.title"),
    PLAYER_DISABLED_POTION_BLAZE_POWDER_SHIFT("player.disabled-potion.blaze-powder-shift"),
    PLAYER_DISABLED_POTION_CONSUME("player.disabled-potion.consume"),
    PLAYER_DISABLED_POTION_CRAFT("player.disabled-potion.craft"),
    PLAYER_END_NOT_ACTIVE("player.not-active.end"),
    PLAYER_LIFES_REMAINING("player.lifes-remaining"),
    PLAYER_LOCKED_CHEST_ACCESS_UNLOCKED("player.locked-chest.access-unlocked"),
    PLAYER_LOCKED_CHEST_NO_ACCESS("player.locked-chest.no-access"),
    PLAYER_LOCKED_CHEST_TOO_EARLY("player.locked-chest.too-early"),
    PLAYER_NETHER_NOT_ACTIVE("player.not-active.nether"),
    PLAYER_NETHER_PORTAL_SETUP("player.nether-portal.setup"),
    PLAYER_NETHER_PORTAL_TOO_EARLY("player.nether-portal.too-early"),
    PLAYER_OPEN_LOCKED_CHEST_CREATIVE("player.locked-chest.creative"),
    PLAYER_PAUSE("player.pause"),
    PLAYER_PLACE_WATER_NEXT("player.place-water-next"),
    PLAYER_SELF_BASE_ENTER("player.base.self.enter"),
    PLAYER_SELF_BASE_EXIT("player.base.self.exit"),
    PLAYER_SELF_CHEST_ROOM_ENTER("player.base.chest-room.self.enter"),
    PLAYER_SELF_CHEST_ROOM_EXIT("player.base.chest-room.self.exit"),
    PLAYER_TNT_JUMP_DENIED("player.tntjump-denied"),
    PLAYER_TP_IN_BASE("player.tp-in-base"),
    PLAYER_TNT_NOT_ACTIVE("player.not-active.tnt"),

    SCOREBOARD_INTRO_EXAMPLE("scoreboard.intro.example"),
    SCOREBOARD_INTRO_EXAMPLE_RESULT("scoreboard.intro.example.result"),
    SCOREBOARD_INTRO_NUMBERS("scoreboard.intro.numbers"),
    SCOREBOARD_INTRO_SET_LINE("scoreboard.intro.setLine"),
    SCOREBOARD_INTRO_TRY_YOURSELF("scoreboard.intro.try-yourself"),

    SCOREBOARD_RULES("scoreboard.rules"),
    SCOREBOARD_TEAMS("scoreboard.teams"),

    SCOREBOARD_DEFAULT("scoreboard.default"),
    SCOREBOARD_BASE("scoreboard.base"),
    SCOREBOARD_PORTAL("scoreboard.portal"),

    TIP_BUG("tip.bug"),
    TIP_CHARGED_CREEPERS("tip.chargedCreepers"),
    TIP_DAY_DURATION("tip.dayDuration"),
    TIP_DISABLED_POTIONS("tip.disabledPotions"),
    TIP_DISCORD("tip.discord"),
    TIP_DO_PAUSE_AFTER_DAY("tip.doPauseAfterDay"),
    TIP_LOCKED_CHEST("tip.lockedChest"),
    TIP_PLACE_BLOCK_IN_CAVE("tip.placeBlockInCave"),
    TIP_RESTORE("tip.restore"),
    TIP_SCOREBOARD_EDIT("tip.scoreboardEdit"),
    TIP_STARTER_INV("tip.starterInv"),
    TIP_TAB_COMPLETION("tip.tabCompletion"),
    TIP_TNT_JUMP("tip.tntJump"),
    TIP_WATER_NEXT_TO_BASE("tip.waterNextToBase"),
    TIP_CHEST_LOCK("tip.chestLock"),
    TIP_FK_ADVERTISEMENTS("tip.fkAdvertisements"),

    CORRUPT_CONFIG_FILES("corrupt.config-files"),

    UNIT_BLOCK("block"),
    UNIT_BLOCKS("blocks"),
    UNIT_DAY("day"),
    UNIT_DAYS("days"),
    UNIT_DEATH("death"),
    UNIT_DEATHS("deaths"),
    UNIT_HOUR("hour"),
    UNIT_HOURS("hours"),
    UNIT_MINUTE("minute"),
    UNIT_MINUTES("minutes"),
    UNIT_NAME("name"),
    UNIT_NAMES("names"),
    UNIT_SECOND("second"),
    UNIT_SECONDS("seconds"),
    UNIT_TIME("time"),
    UNIT_TIMES("times"),
    UNIT_TRIES("tries"),
    UNIT_TRY("try"),

    PLACE_HOLDER_DAY("placeHolder.day"),
    PLACE_HOLDER_HOUR("placeHolder.hour"),
    PLACE_HOLDER_MINUTES("placeHolder.minutes"),
    PLACE_HOLDER_PLAYER_TEAM("placeHolder.player.team"),
    PLACE_HOLDER_DEATHS_COUNT("placeHolder.deaths.count"),
    PLACE_HOLDER_KILLS_COUNT("placeHolder.kills.count"),
    PLACE_HOLDER_BASE_DISTANCE("placeHolder.base.distance"),
    PLACE_HOLDER_BASE_DIRECTION("placeHolder.base.direction"),
    PLACE_HOLDER_BASE_OR_PORTAL("placeHolder.base-or-portal"),
    PLACE_HOLDER_ENEMY_TEAM_BASE("placeHolder.enemy.team.base"),
    PLACE_HOLDER_ENEMY_TEAM_BASE_DIRECTION("placeHolder.enemy.team.base.direction"),
    PLACE_HOLDER_ACTIVE_PVP("placeHolder.active.pvp"),
    PLACE_HOLDER_ACTIVE_ASSAULTS("placeHolder.active.assaults"),
    PLACE_HOLDER_OPEN_NETHER("placeHolder.open.nether"),
    PLACE_HOLDER_OPEN_END("placeHolder.open.end"),

    CONSOLE_LANG_COULD_NOT_LIST_FILES("console.lang.could-not-list-files"),
    CONSOLE_ADJUSTMENT_GAME_TIME("console.adjustment-game-time"),
    CONSOLE_AT("console.at"),
    CONSOLE_KICK_MESSAGE("console.kick.message"),
    CONSOLE_LIGHT_ERROR("console.light-error"),
    CONSOLE_UNABLE_TO_MAKE_BACKUP("console.unable-to-make-backup"),
    CONSOLE_WORLD_NOT_FOUND_1("console.world.not-found.1"),
    CONSOLE_WORLD_NOT_FOUND_2("console.world.not-found.2"),
    CONSOLE_MANAGER_DONOT_HAVE_COMMAND_REGISTERED("console.manager.donot-have-command-registered"),
    CONSOLE_PLUGIN_IS_DEVELOPMENT_VERSION("console.plugin.is-development-version"),
    CONSOLE_NEW_VERSION_AVAILABLE("console.new.version.available"),
    CONSOLE_NEW_VERSION_AVAILABLE_1("console.new-version.available.1"),
    CONSOLE_NEW_VERSION_AVAILABLE_2("console.new-version.available.2"),
    CONSOLE_NEW_VERSION_AVAILABLE_3("console.new-version.available.3"),
    CONSOLE_DOWNLOADING_NEW_VERSION("console.downloading-new-version"),
    CONSOLE_VERSION_DOWNLOADED("console.version.downloaded"),
    CONSOLE_DOWNLOADING_UPDATER("console.downloading.updater"),
    CONSOLE_UPDATER_DOWNLOADED("console.updater.downloaded"),
    CONSOLE_UPDATE("console.update"),
    CONSOLE_UPDATE_ERROR("console.update.error"),
    CONSOLE_UPDATE_ERROR_OCCURRED("console.update.error.occurred"),
    CONSOLE_UNABLE_TO_CREATE_PARENT_FOLDER("console.unable.to-create.parent-folder"),
    CONSOLE_CANNOT_LOAD("console.cannot.load"),
    CONSOLE_CANNOT_READ("console.cannot.read"),
    CONSOLE_CANNOT_WRITE("console.cannot.write"),
    CONSOLE_FAILED_TO_CREATE_FILE("console.failed.to-create.file"),
    CONSOLE_SERVER_RESTART("console.server.restart"),
    CONSOLE_CHARGED_CREEPERS_NOT_USE("console.charged-creepers.not-use"),
    CONSOLE_UNKNOWN_MATERIAL("console.unknown.material"),
    CONSOLE_CAUSE("console.cause"),
    CONSOLE_UNABLE_TO_LOAD_LANGUAGE_FILE_1("console.unable.toLoad.languageFile.1"),
    CONSOLE_UNABLE_TO_LOAD_LANGUAGE_FILE_2("console.unable.toLoad.languageFile.2"),

    WARNING("warning"),
    WARNING_GAME_RESET("warning.game.reset"),
    WARNING_SCOREBOARD_RESET("warning.scoreboard.reset"),
    WARNING_STOP("warning.stop"),
    WARNING_UNKNOWN_COLOR("warning.unknown-color");

    private final String accessor;

    Messages(String accessor) {
        this.accessor = accessor;
    }

    public String getAccessor() {
        return accessor;
    }

    public String getMessage() {
        return ChatUtils.colorMessage(this);
    }

    public void send(CommandSender sender) {
        ChatUtils.sendMessage(sender, this);
    }

    @Override
    public String toString() {
        return getMessage();
    }

    public enum Unit {
        DAYS(UNIT_DAY, UNIT_DAYS),
        DEATHS(UNIT_DEATH, UNIT_DEATHS),
        BLOCKS(UNIT_BLOCK, UNIT_BLOCKS),
        HOURS(UNIT_HOUR, UNIT_HOURS),
        MINUTES(UNIT_MINUTE, UNIT_MINUTES),
        NAMES(UNIT_NAME, UNIT_NAMES),
        SECONDS(UNIT_SECOND, UNIT_SECONDS),
        TIME(UNIT_TIME, UNIT_TIMES),
        TRY(UNIT_TRY, UNIT_TRIES);

        private final String key;
        private final ChoiceFormat choiceFormat;

        Unit(Messages... format) {
            this.key = format[0].getAccessor();
            this.choiceFormat = new ChoiceFormat(new double[]{1, 2}, Arrays.stream(format).map(Messages::getMessage).toArray(String[]::new));
        }

        public String tl(int nb) {
            return choiceFormat.format(nb);
        }

        public String getKey() {
            return key;
        }
    }
}
