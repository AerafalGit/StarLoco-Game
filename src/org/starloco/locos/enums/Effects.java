package org.starloco.locos.enums;

public enum Effects {
    /**
     * Téléporte à une distance de #1 cases maximum
     */
    TELEPORT_MAX_DISTANCE(4),

    /**
     * Fait reculer de #1 case(s)
     */
    PUSH_BACK(5),

    /**
     * Fait avancer de #1 case(s)
     */
    PUSH_FORWARD(6),

    /**
     * Divorcer le couple
     */
    DIVORCE_COUPLE(7),

    /**
     * Echange les places de 2 joueurs
     */
    EXCHANGE_POSITIONS(8),

    /**
     * Esquive #1% des coups en reculant de #2 case(s)
     */
    DODGE_PUSH_BACK(9),

    /**
     * Permet d'utiliser l'attitude #3
     */
    ENABLE_ATTITUDE(10),

    /**
     * Change le temps de jeu d'un joueur
     */
    CHANGE_GAME_TIME(13),

    /**
     * Porter un joueur
     */
    CARRY_PLAYER(50),

    /**
     * Jeter un joueur
     */
    THROW_PLAYER(51),

    /**
     * Vole #1{~1~2 à }#2 PM
     */
    STEAL_MP(77),

    /**
     * Ajoute +#1{~1~2 à }#2 PM
     */
    ADD_MP(78),

    /**
     * #3% dommages subis x#1, sinon soigné de x#2
     */
    CONDITIONAL_DAMAGE_HEAL(79),

    /**
     * PDV rendus : #1{~1~2 à }#2
     */
    HEAL_HP(81),

    /**
     * Vole #1{~1~2 à }#2 PDV (fixe)
     */
    STEAL_HP_FIXED(82),

    /**
     * Vole #1{~1~2 à }#2 PA
     */
    STEAL_AP(84),

    /**
     * Dommages : #1{~1~2 à }#2% de la vie de l'attaquant (eau)
     */
    DAMAGE_WATER_PERCENT_LIFE(85),

    /**
     * Dommages : #1{~1~2 à }#2% de la vie de l'attaquant (terre)
     */
    DAMAGE_EARTH_PERCENT_LIFE(86),

    /**
     * Dommages : #1{~1~2 à }#2% de la vie de l'attaquant (air)
     */
    DAMAGE_AIR_PERCENT_LIFE(87),

    /**
     * Dommages : #1{~1~2 à }#2% de la vie de l'attaquant (feu)
     */
    DAMAGE_FIRE_PERCENT_LIFE(88),

    /**
     * Dommages : #1{~1~2 à }#2% de la vie de l'attaquant (neutre)
     */
    DAMAGE_NEUTRAL_PERCENT_LIFE(89),

    /**
     * Donne #1{~1~2 à }#2 % de sa vie
     */
    GIVE_PERCENTAGE_LIFE(90),

    /**
     * Vole #1{~1~2 à }#2 PDV (eau)
     */
    STEAL_HP_WATER(91),

    /**
     * Vole #1{~1~2 à }#2 PDV (terre)
     */
    STEAL_HP_EARTH(92),

    /**
     * Vole #1{~1~2 à }#2 PDV (air)
     */
    STEAL_HP_AIR(93),

    /**
     * Vole #1{~1~2 à }#2 PDV (feu)
     */
    STEAL_HP_FIRE(94),

    /**
     * Vole #1{~1~2 à }#2 PDV (neutre)
     */
    STEAL_HP_NEUTRAL(95),

    /**
     * Dommages : #1{~1~2 à }#2 (eau)
     */
    DAMAGE_WATER(96),

    /**
     * Dommages : #1{~1~2 à }#2 (terre)
     */
    DAMAGE_EARTH(97),

    /**
     * Dommages : #1{~1~2 à }#2 (air)
     */
    DAMAGE_AIR(98),

    /**
     * Dommages : #1{~1~2 à }#2 (feu)
     */
    DAMAGE_FIRE(99),

    /**
     * Dommages : #1{~1~2 à }#2 (neutre)
     */
    DAMAGE_NEUTRAL(100),

    /**
     * PA perdus à la cible : #1{~1~2 à }#2
     */
    LOSE_AP(101),

    /**
     * Dommages réduits de #1{~1~2 à }#2
     */
    REDUCE_DAMAGE(105),

    /**
     * Renvoie un sort de niveau #2 maximum
     */
    REFLECT_SPELL(106),

    /**
     * Dommages retournés : #1{~1~2 à }#2
     */
    RETURN_DAMAGE(107),

    /**
     * PDV rendus : #1{~1~2 à }#2
     */
    HEAL_HP_ALT(108),

    /**
     * Dommages pour le lanceur : #1{~1~2 à }#2
     */
    DAMAGE_TO_CASTER(109),

    /**
     * +#1{~1~2 à }#2 en vie
     */
    ADD_VITALITY(110),

    /**
     * +#1{~1~2 à }#2 PA
     */
    GAIN_AP(111),

    /**
     * +#1{~1~2 à }#2 de dommages
     */
    ADD_DAMAGE(112),

    /**
     * Double les dommages ou rend  #1{~1~2 à }#2 PDV
     */
    DOUBLE_DAMAGE_OR_HEAL(113),

    /**
     * Multiplie les dommages par #1
     */
    MULTIPLY_DAMAGE(114),

    /**
     * +#1{~1~2 à }#2 aux coups critiques
     */
    ADD_CRITICAL(115),

    /**
     * -#1{~1~2 à -}#2 à la portée
     */
    REDUCE_RANGE(116),

    /**
     * +#1{~1~2 à }#2 à la portée
     */
    ADD_RANGE(117),

    /**
     * +#1{~1~2 à }#2 en force
     */
    ADD_STRENGTH(118),

    /**
     * +#1{~1~2 à }#2 en agilité
     */
    ADD_AGILITY(119),

    /**
     * Ajoute +#1{~1~2 à }#2 PA
     */
    ADD_AP(120),

    /**
     * +#1{~1~2 à }#2 de dommages
     */
    ADD_DAMAGE_FLAT(121),

    /**
     * +#1{~1~2 à }#2 aux échecs critiques
     */
    ADD_CRITICAL_FAILURE(122),

    /**
     * +#1{~1~2 à }#2 à la chance
     */
    ADD_CHANCE(123),

    /**
     * +#1{~1~2 à }#2 en sagesse
     */
    ADD_WISDOM(124),

    /**
     * +#1{~1~2 à }#2 en vitalité
     */
    ADD_VITALITY_STAT(125),

    /**
     * +#1{~1~2 à }#2 en intelligence
     */
    ADD_INTELLIGENCE(126),

    /**
     * PM perdus : #1{~1~2 à }#2
     */
    LOSE_MP(127),

    /**
     * +#1{~1~2 à }#2 PM
     */
    ADD_MP_STAT(128),

    /**
     * Vole  #1{~1~2 à }#2 d'or
     */
    STEAL_KAMAS(130),

    /**
     * #1 PA utilisés font perdre #2 PDV
     */
    AP_COST_HP_LOSS(131),

    /**
     * Enlève les envoûtements
     */
    REMOVE_SPELLS(132),

    /**
     * PA perdus pour le lanceur : #1{~1~2 à }#2
     */
    LOSE_AP_CASTER(133),

    /**
     * PM perdus pour le lanceur : #1{~1~2 à }#2
     */
    LOSE_MP_CASTER(134),

    /**
     * Portée du lanceur réduite de : #1{~1~2 à }#2
     */
    REDUCE_CASTER_RANGE(135),

    /**
     * Portée du lanceur augmentée de : #1{~1~2 à }#2
     */
    INCREASE_CASTER_RANGE(136),

    /**
     * Dommages physiques du lanceur augmentés de : #1{~1~2 à }#2
     */
    INCREASE_PHYSICAL_DAMAGE(137),

    /**
     * Augmente les dommages de #1{~1~2 à }#2%
     */
    INCREASE_DAMAGE_PERCENT(138),

    /**
     * Rend #1{~1~2 à }#2 points d'énergie
     */
    RESTORE_ENERGY(139),

    /**
     * Fait passer le tour suivant
     */
    SKIP_TURN(140),

    /**
     * Tue la cible
     */
    KILL_TARGET(141),

    /**
     * +#1{~1~2 à }#2 aux dommages physiques
     */
    ADD_PHYSICAL_DAMAGE(142),

    /**
     * PDV rendus : #1{~1~2 à }#2
     */
    HEAL_HP_SIMPLE(143),

    /**
     * Dommages : #1{~1~2 à }#2 (non boostés)
     */
    DAMAGE_UNBOOSTED(144),

    /**
     * -#1{~1~2 à }#2 aux dommages
     */
    REDUCE_DAMAGE_FLAT(145),

    /**
     * Change les paroles
     */
    CHANGE_SPEECH(146),

    /**
     * Ressuscite un allié
     */
    RESURRECT_ALLY(147),

    /**
     * Quelqu'un vous suit !
     */
    SOMEONE_FOLLOWS(148),

    /**
     * Change l'apparence
     */
    CHANGE_APPEARANCE(149),

    /**
     * Rend le personnage invisible
     */
    INVISIBILITY(150),

    /**
     * -#1{~1~2 à -}#2 en chance
     */
    REDUCE_CHANCE(152),

    /**
     * -#1{~1~2 à -}#2 en vitalité
     */
    REDUCE_VITALITY(153),

    /**
     * -#1{~1~2 à -}#2 en agilité
     */
    REDUCE_AGILITY(154),

    /**
     * -#1{~1~2 à -}#2 en intelligence
     */
    REDUCE_INTELLIGENCE(155),

    /**
     * -#1{~1~2 à -}#2 en sagesse
     */
    REDUCE_WISDOM(156),

    /**
     * -#1{~1~2 à -}#2 en force
     */
    REDUCE_STRENGTH(157),

    /**
     * Augmente le poids portable de #1{~1~2 à }#2 pods
     */
    INCREASE_PODS(158),

    /**
     * Réduit le poids portable de #1{~1~2 à }#2 pods
     */
    REDUCE_PODS(159),

    /**
     * +#1{~1~2 à }#2% de chance d'esquiver les pertes de PA
     */
    DODGE_AP_LOSS(160),

    /**
     * +#1{~1~2 à }#2% de chance d'esquiver les pertes de PM
     */
    DODGE_MP_LOSS(161),

    /**
     * -#1{~1~2 à }#2% de chance d'esquiver les pertes de PA
     */
    REDUCE_DODGE_AP_LOSS(162),

    /**
     * -#1{~1~2 à }#2% de chance d'esquiver les pertes de PM
     */
    REDUCE_DODGE_MP_LOSS(163),

    /**
     * Dommages réduits de #1%
     */
    REDUCE_DAMAGE_PERCENT(164),

    /**
     * Augmente les dommages (#1) de #2%
     */
    BOOST_ELEMENT_DAMAGE(165),

    /**
     * PA retournés : #1{~1~2 à }#2
     */
    RETURN_AP(166),

    /**
     * -#1{~1~2 à -}#2 PA
     */
    REMOVE_AP(168),

    /**
     * -#1{~1~2 à -}#2 PM
     */
    REMOVE_MP(169),

    /**
     * -#1{~1~2 à }#2 aux coups critiques
     */
    REDUCE_CRITICAL(171),

    /**
     * Réduction magique diminué de #1{~1~2 à }#2
     */
    REDUCE_MAGIC_RESISTANCE(172),

    /**
     * Réduction physique diminué de #1{~1~2 à }#2
     */
    REDUCE_PHYSICAL_RESISTANCE(173),

    /**
     * +#1{~1~2 à }#2 en initiative
     */
    ADD_INITIATIVE(174),

    /**
     * -#1{~1~2 à }#2 en initiative
     */
    REDUCE_INITIATIVE(175),

    /**
     * +#1{~1~2 à }#2 en prospection
     */
    ADD_PROSPECTING(176),

    /**
     * -#1{~1~2 à }#2 en prospection
     */
    REDUCE_PROSPECTING(177),

    /**
     * +#1{~1~2 à }#2 de soins
     */
    ADD_HEALS(178),

    /**
     * -#1{~1~2 à }#2 de soins
     */
    REDUCE_HEALS(179),

    /**
     * Crée un double du lanceur de sort
     */
    CREATE_DOUBLE(180),

    /**
     * Invoque : #1
     */
    SUMMON_CREATURE(181),

    /**
     * +#1{~1~2 à }#2 créatures invocables
     */
    ADD_SUMMONS(182),

    /**
     * Réduction magique de #1{~1~2 à }#2
     */
    MAGIC_RESISTANCE(183),

    /**
     * Réduction physique de #1{~1~2 à }#2
     */
    PHYSICAL_RESISTANCE(184),

    /**
     * Invoque une créature statique
     */
    SUMMON_STATIC(185),

    /**
     * Diminue les dommages de #1{~1~2 à }#2%
     */
    REDUCE_DAMAGE_PERCENT_MALUS(186),

    /**
     * Changer l'alignement
     */
    CHANGE_ALIGNMENT(188),

    /**
     * Gagner #1{~1~2 à }#2 kamas
     */
    GAIN_KAMAS(194),

    /**
     * Transforme en #1
     */
    TRANSFORM_INTO(197),

    /**
     * Pose un objet au sol
     */
    DROP_ITEM(201),

    /**
     * Dévoile tous les objets invisibles
     */
    REVEAL_INVISIBLE(202),

    /**
     * Ressuscite la cible
     */
    RESURRECT_TARGET(206),

    /**
     * #1{~1~2 à }#2 % de résistance à la terre
     */
    EARTH_RESISTANCE(210),

    /**
     * #1{~1~2 à }#2 % de résistance à l'eau
     */
    WATER_RESISTANCE(211),

    /**
     * #1{~1~2 à }#2 % de résistance à l'air
     */
    AIR_RESISTANCE(212),

    /**
     * #1{~1~2 à }#2 % de résistance au feu
     */
    FIRE_RESISTANCE(213),

    /**
     * #1{~1~2 à }#2 % de résistance neutre
     */
    NEUTRAL_RESISTANCE(214),

    /**
     * #1{~1~2 à }#2 % de faiblesse face à la terre
     */
    EARTH_WEAKNESS(215),

    /**
     * #1{~1~2 à }#2 % de faiblesse face à l'eau
     */
    WATER_WEAKNESS(216),

    /**
     * #1{~1~2 à }#2 % de faiblesse face à l'air
     */
    AIR_WEAKNESS(217),

    /**
     * #1{~1~2 à }#2 % de faiblesse face au feu
     */
    FIRE_WEAKNESS(218),

    /**
     * #1{~1~2 à }#2 % de faiblesse neutre
     */
    NEUTRAL_WEAKNESS(219),

    /**
     * Renvoie #1{~1~2 à }#2 dommages
     */
    REFLECT_DAMAGE(220),

    /**
     * Qu'y a-t-il là dedans ?
     */
    WHATS_INSIDE_1(221),

    /**
     * Qu'y a-t-il là dedans ?
     */
    WHATS_INSIDE_2(222),

    /**
     * +#1{~1~2 à }#2 de dommages aux pièges
     */
    ADD_TRAP_DAMAGE(225),

    /**
     * +#1{~1~2 à }#2% de dommages aux pièges
     */
    ADD_TRAP_DAMAGE_PERCENT(226),

    /**
     * Récupère une monture !
     */
    GET_MOUNT(229),

    /**
     * +#1 en énergie perdue
     */
    ENERGY_LOSS(230),

    /**
     * Transforme en #1
     */
    TRANSFORM_INTO_ALT(239),

    /**
     * +#1{~1~2 à }#2 de résistance à la terre
     */
    EARTH_RESISTANCE_FIXED(240),

    /**
     * +#1{~1~2 à }#2 de résistance à l'eau
     */
    WATER_RESISTANCE_FIXED(241),

    /**
     * +#1{~1~2 à }#2 de résistance à l'air
     */
    AIR_RESISTANCE_FIXED(242),

    /**
     * +#1{~1~2 à }#2 de résistance au feu
     */
    FIRE_RESISTANCE_FIXED(243),

    /**
     * +#1{~1~2 à }#2 de résistance neutre
     */
    NEUTRAL_RESISTANCE_FIXED(244),

    /**
     * -#1{~1~2 à }#2 de résistance à la terre
     */
    REDUCE_EARTH_RESISTANCE(245),

    /**
     * -#1{~1~2 à }#2 de résistance à l'eau
     */
    REDUCE_WATER_RESISTANCE(246),

    /**
     * -#1{~1~2 à }#2 de résistance à l'air
     */
    REDUCE_AIR_RESISTANCE(247),

    /**
     * -#1{~1~2 à }#2 de résistance au feu
     */
    REDUCE_FIRE_RESISTANCE(248),

    /**
     * -#1{~1~2 à }#2 de résistance neutre
     */
    REDUCE_NEUTRAL_RESISTANCE(249),

    /**
     * #1{~1~2 à }#2 % de res. terre face aux combattants
     */
    PVP_EARTH_RESISTANCE(250),

    /**
     * #1{~1~2 à }#2 % de res. eau face aux combattants
     */
    PVP_WATER_RESISTANCE(251),

    /**
     * #1{~1~2 à }#2 % de res. air face aux combattants
     */
    PVP_AIR_RESISTANCE(252),

    /**
     * #1{~1~2 à }#2 % de res. feu face aux combattants
     */
    PVP_FIRE_RESISTANCE(253),

    /**
     * #1{~1~2 à }#2 % de res. neutre face aux combattants
     */
    PVP_NEUTRAL_RESISTANCE(254),

    /**
     * #1{~1~2 à }#2 % de faiblesse terre face aux combattants
     */
    PVP_EARTH_WEAKNESS(255),

    /**
     * #1{~1~2 à }#2 % de faiblesse eau face aux combattants
     */
    PVP_WATER_WEAKNESS(256),

    /**
     * #1{~1~2 à }#2 % de faiblesse air face aux combattants
     */
    PVP_AIR_WEAKNESS(257),

    /**
     * #1{~1~2 à }#2 % de faiblesse feu face aux combattants
     */
    PVP_FIRE_WEAKNESS(258),

    /**
     * #1{~1~2 à }#2 % de faiblesse neutre face aux combattants
     */
    PVP_NEUTRAL_WEAKNESS(259),

    /**
     * +#1{~1~2 à }#2 de res. terre face aux combattants
     */
    PVP_EARTH_RESISTANCE_FIXED(260),

    /**
     * +#1{~1~2 à }#2 de res. eau face aux combattants
     */
    PVP_WATER_RESISTANCE_FIXED(261),

    /**
     * +#1{~1~2 à }#2 de res. air face aux combattants
     */
    PVP_AIR_RESISTANCE_FIXED(262),

    /**
     * +#1{~1~2 à }#2 de res. feu aux combattants
     */
    PVP_FIRE_RESISTANCE_FIXED(263),

    /**
     * +#1{~1~2 à }#2 de res. neutre aux combattants
     */
    PVP_NEUTRAL_RESISTANCE_FIXED(264),

    /**
     * Dommages réduits de #1{~1~2 à }#2
     */
    REDUCE_DAMAGE_VARIABLE(265),

    /**
     * #1{~1~2 à -}#2 vol de chance
     */
    STEAL_CHANCE_MALUS(266),

    /**
     * #1{~1~2 à -}#2 vol de vitalité
     */
    STEAL_VITALITY_MALUS(267),

    /**
     * #1{~1~2 à -}#2 vol d'agilité
     */
    STEAL_AGILITY_MALUS(268),

    /**
     * #1{~1~2 à -}#2 vol d'intelligence
     */
    STEAL_INTELLIGENCE_MALUS(269),

    /**
     * #1{~1~2 à -}#2 vol de sagesse
     */
    STEAL_WISDOM_MALUS(270),

    /**
     * #1{~1~2 à -}#2 vol de force
     */
    STEAL_STRENGTH_MALUS(271),

    /**
     * Dommages : #1{~1~2 à }#2% de la vie manquante de l'attaquant (eau)
     */
    DAMAGE_MISSING_LIFE_WATER(275),

    /**
     * Dommages : #1{~1~2 à }#2% de la vie manquante de l'attaquant (terre)
     */
    DAMAGE_MISSING_LIFE_EARTH(276),

    /**
     * Dommages : #1{~1~2 à }#2% de la vie manquante de l'attaquant (air)
     */
    DAMAGE_MISSING_LIFE_AIR(277),

    /**
     * Dommages : #1{~1~2 à }#2% de la vie manquante de l'attaquant (feu)
     */
    DAMAGE_MISSING_LIFE_FIRE(278),

    /**
     * Dommages : #1{~1~2 à }#2% de la vie manquante de l'attaquant (neutre)
     */
    DAMAGE_MISSING_LIFE_NEUTRAL(279),

    /**
     * Augmente la portée du sort #1 de #3
     */
    INCREASE_SPELL_RANGE(281),

    /**
     * Rend la portée du sort #1 modifiable
     */
    MAKE_SPELL_RANGE_MODIFIABLE(282),

    /**
     * +#3 de dommages sur le sort #1
     */
    ADD_SPELL_DAMAGE(283),

    /**
     * +#3 de soins sur le sort #1
     */
    ADD_SPELL_HEAL(284),

    /**
     * Réduit de #3 le coût en PA du sort #1
     */
    REDUCE_SPELL_AP_COST(285),

    /**
     * Réduit de #3 le délai de relance du sort #1
     */
    REDUCE_SPELL_COOLDOWN(286),

    /**
     * +#3 aux CC sur le sort #1
     */
    ADD_SPELL_CRITICAL(287),

    /**
     * Désactive le lancer en ligne du sort #1
     */
    DISABLE_SPELL_LINE_CAST(288),

    /**
     * Désactive la ligne de vue du sort #1
     */
    DISABLE_SPELL_LINE_OF_SIGHT(289),

    /**
     * Augmente de #3 le nombre de lancer maximal par tour du sort #1
     */
    INCREASE_SPELL_MAX_CAST_PER_TURN(290),

    /**
     * Augmente de #3 le nombre de lancer maximal par cible du sort #1
     */
    INCREASE_SPELL_MAX_CAST_PER_TARGET(291),

    /**
     * Fixe à #3 le délai de relance du sort #1
     */
    SET_SPELL_COOLDOWN(292),

    /**
     * Augmente les dégâts de base du sort #1 de #3
     */
    INCREASE_SPELL_BASE_DAMAGE(293),

    /**
     * Diminue la portée du sort #1 de #3
     */
    REDUCE_SPELL_RANGE(294),

    /**
     * Lance le sort #3
     */
    CAST_SPELL(300),

    /**
     *
     */
    EMPTY_EFFECT(310),

    /**
     * Vole #1{~1~2 à }#2 PO
     */
    STEAL_RANGE(320),

    /**
     * Change une couleur
     */
    CHANGE_COLOR(333),

    /**
     * Change l'apparence
     */
    CHANGE_APPEARANCE_ALT(335),

    /**
     * Pose un piège de rang #2
     */
    SET_TRAP(400),

    /**
     * Pose un glyphe de rang #2
     */
    SET_GLYPH1(401),

    /**
     * Pose un glyphe de rang #2
     */
    SET_GLYPH2(402),

    /**
     * Tue et remplace par une invocation
     */
    KILL_AND_SUMMON(405),

    /**
     * [wip]Enlève les effets du sort %1
     */
    REMOVE_SPELL_EFFECT(406),

    /**
     * Efficacité : #3
     */
    EFFICIENCY(448),

    /**
     * Pose un prisme
     */
    SET_PRISM(513),

    /**
     * Téléporte au point de sauvegarde
     */
    TELEPORT_TO_SAVE_POINT(600),

    /**
     * Téléporte : '#1' en (#2, #3)
     */
    TELEPORT_TO_COORDINATES(601),

    /**
     * Enregistre sa position
     */
    SAVE_POSITION(602),

    /**
     * Apprend le métier #3
     */
    LEARN_JOB(603),

    /**
     * Apprend le sort #3
     */
    LEARN_SPELL(604),

    /**
     * +#1{~1~2 à }#2 points d'XP
     */
    ADD_XP(605),

    /**
     * +#1{~1~2 à }#2 en sagesse
     */
    ADD_WISDOM_PERMANENT(606),

    /**
     * +#1{~1~2 à }#2 en force
     */
    ADD_STRENGTH_PERMANENT(607),

    /**
     * +#1{~1~2 à }#2 en chance
     */
    ADD_CHANCE_PERMANENT(608),

    /**
     * +#1{~1~2 à }#2 en agilité
     */
    ADD_AGILITY_PERMANENT(609),

    /**
     * +#1{~1~2 à }#2 en vitalité
     */
    ADD_VITALITY_PERMANENT(610),

    /**
     * +#1{~1~2 à }#2 en intelligence
     */
    ADD_INTELLIGENCE_PERMANENT(611),

    /**
     * +#1{~1~2 à }#2 points de caractéristique
     */
    ADD_STAT_POINTS(612),

    /**
     * +#1{~1~2 à }#2 points de sort
     */
    ADD_SPELL_POINTS(613),

    /**
     * +#1 d'XP dans le métier #2
     */
    ADD_JOB_XP(614),

    /**
     * Fait oublier le métier de #3
     */
    FORGET_JOB(615),

    /**
     * Fait oublier un niveau du sort #3
     */
    FORGET_SPELL_LEVEL(616),

    /**
     * Consulter #3
     */
    CONSULT(620),

    /**
     * Invoque : #3 (grade #1)
     */
    SUMMON_WITH_GRADE(621),

    /**
     * Téléporte chez soi
     */
    TELEPORT_HOME(622),

    /**
     * Invoque : #3
     */
    SUMMON_SIMPLE(623),

    /**
     * Fait oublier un niveau du sort #3
     */
    FORGET_SPELL_LEVEL_ALT(624),

    /**
     *
     */
    EMPTY_EFFECT2(625),

    /**
     *
     */
    EMPTY_EFFECT3(626),

    /**
     * Reproduit la carte d'origine
     */
    REPRODUCE_ORIGINAL_MAP(627),

    /**
     * Invoque : #3
     */
    SUMMON_ALTERNATIVE(628),

    /**
     *
     */
    EMPTY_EFFECT4(631),

    /**
     * Ajoute #3 points d'honneur
     */
    ADD_HONOR(640),

    /**
     * Ajoute #3 points de déshonneur
     */
    ADD_DISHONOR(641),

    /**
     * Retire #3 points d'honneur
     */
    REMOVE_HONOR(642),

    /**
     * Retire #3 points de déshonneur
     */
    REMOVE_DISHONOR(643),

    /**
     * Ressuscite les alliés présents sur la carte
     */
    RESURRECT_ALL_ALLIES(645),

    /**
     * PDV rendus : #1{~1~2 à }#2
     */
    HEAL_HP_ALT2(646),

    /**
     * Libère les âmes des ennemis
     */
    FREE_ENEMY_SOULS(647),

    /**
     * Libère une âme ennemie
     */
    FREE_ENEMY_SOUL(648),

    /**
     * Faire semblant d'être #3
     */
    PRETEND_TO_BE(649),

    /**
     *
     */
    EMPTY_EFFECT5(654),

    /**
     * Pas d'effet supplémentaire
     */
    NO_ADDITIONAL_EFFECT(666),

    /**
     * Incarnation de niveau #3
     */
    INCARNATION(669),

    /**
     * Dommages : #1{~1~2 à }#2% de la vie de l'attaquant (neutre)
     */
    DAMAGE_NEUTRAL_PERCENT_LIFE_ALT1(670),

    /**
     * Dommages : #1{~1~2 à }#2% de la vie de l'attaquant (neutre)
     */
    DAMAGE_NEUTRAL_PERCENT_LIFE_ALT2(671),

    /**
     * Dommages : #1{~1~2 à }#2% de la vie de l'attaquant (neutre)
     */
    DAMAGE_NEUTRAL_PERCENT_LIFE_ALT3(672),

    /**
     * Lier son métier : #1
     */
    BIND_JOB(699),

    /**
     * Change l'élément de frappe
     */
    CHANGE_STRIKE_ELEMENT(700),

    /**
     * Puissance : #1{~1~2 à }#2
     */
    POWER(701),

    /**
     * +#1{~1~2 à }#2 point de durabilité
     */
    ADD_DURABILITY(702),

    /**
     * #1% capture d'âme de puissance #3
     */
    SOUL_CAPTURE(705),

    /**
     * #1% de proba de capturer une monture
     */
    MOUNT_CAPTURE(706),

    /**
     * Coût supplémentaire
     */
    ADDITIONAL_COST(710),

    /**
     * #1 : #3
     */
    INFO1(715),

    /**
     * #1 : #3
     */
    INFO2(716),

    /**
     * #1 : #3
     */
    INFO3(717),

    /**
     * Nombre de victimes : #2
     */
    VICTIM_COUNT(720),

    /**
     * Donne le sort « #3 »
     */
    GIVE_SPELL(722),

    /**
     * Afficher le titre : « #3 »
     */
    DISPLAY_TITLE(724),

    /**
     * Renommer la guilde : #4
     */
    RENAME_GUILD(725),

    /**
     * Téléporte au prisme allié le plus proche
     */
    TELEPORT_TO_NEAREST_PRISM(730),

    /**
     * Agresse les joueurs de l'alignement ennemi automatiquement
     */
    AUTO_AGGRESS_ENEMIES(731),

    /**
     *
     */
    EMPTY_EFFECT6(740),

    /**
     *
     */
    EMPTY_EFFECT7(741),

    /**
     *
     */
    EMPTY_EFFECT8(742),

    /**
     * Bonus aux chances de capture : #1{~1~2 à }#2%
     */
    CAPTURE_BONUS(750),

    /**
     * Bonus à l'xp de la dragodinde : #1{~1~2 à }#2%
     */
    DRAGONDE_XP_BONUS(751),

    /**
     * Disparaît en se déplaçant
     */
    DISAPPEAR_ON_MOVE(760),

    /**
     * Echange les places de 2 joueurs
     */
    EXCHANGE_POSITIONS_ALT(765),

    /**
     * Confusion horaire : #1{~1~2 à }#2 degrés
     */
    CONFUSION_CLOCKWISE_DEGREES(770),

    /**
     * Confusion horaire : #1{~1~2 à }#2 Pi/2
     */
    CONFUSION_CLOCKWISE_PI2(771),

    /**
     * Confusion horaire : #1{~1~2 à }#2 Pi/4
     */
    CONFUSION_CLOCKWISE_PI4(772),

    /**
     * Confusion contre horaire : #1{~1~2 à }#2 degrés
     */
    CONFUSION_COUNTER_CLOCKWISE_DEGREES(773),

    /**
     * Confusion contre horaire : #1{~1~2 à }#2 Pi/2
     */
    CONFUSION_COUNTER_CLOCKWISE_PI2(774),

    /**
     * Confusion contre horaire : #1{~1~2 à }#2 Pi/4
     */
    CONFUSION_COUNTER_CLOCKWISE_PI4(775),

    /**
     * +#1{~1~2 à }#2% de dégâts subis permanents
     */
    PERMANENT_DAMAGE_TAKEN(776),

    /**
     * Invoque le dernier allié mort avec #1{~1~2 à }#2 % de ses PDV
     */
    SUMMON_LAST_DEAD_ALLY(780),

    /**
     * Minimise les effets aléatoires
     */
    MINIMIZE_RANDOM_EFFECTS(781),

    /**
     * Maximise les effets aléatoires
     */
    MAXIMIZE_RANDOM_EFFECTS(782),

    /**
     * Pousse jusqu'à la case visée
     */
    PUSH_TO_TARGET_CELL(783),

    /**
     * Retour à la position de départ
     */
    RETURN_TO_START_POSITION(784),

    /**
     *
     */
    EMPTY_EFFECT_9(785),

    /**
     * Soigne sur attaque
     */
    HEAL_ON_ATTACK(786),

    /**
     * #1
     */
    VARIABLE_EFFECT(787),

    /**
     * Châtiment de #2 sur #3 tour(s)
     */
    PUNISHMENT(788),

    /**
     *
     */
    EMPTY_EFFECT_10(789),

    /**
     *
     */
    EMPTY_EFFECT_11(790),

    /**
     * Prépare #1{~1~2 à }#2 parchemins pour mercenaire
     */
    PREPARE_SCROLLS_MERCENARY(791),

    /**
     * Arme de chasse
     */
    HUNTING_WEAPON(795),

    /**
     * Points de vie : #3
     */
    HEALTH_POINTS(800),

    /**
     * Reçu le : #1
     */
    RECEIVED_DATE(805),

    /**
     * Corpulence : #1
     */
    CORPULENCE(806),

    /**
     * Dernier repas : #1
     */
    LAST_MEAL(807),

    /**
     * A mangé le : #1
     */
    ATE_ON(808),

    /**
     * Taille : #3 poces
     */
    SIZE(810),

    /**
     * Tour(s) restant(s) : #3
     */
    TURNS_REMAINING(811),

    /**
     * Résistance : #2 / #3
     */
    RESISTANCE_INFO(812),

    /**
     *
     */
    EMPTY_EFFECT_12(813),

    /**
     * #1
     */
    VARIABLE_INFO(814),

    /**
     *
     */
    EMPTY_EFFECT_13(815),

    /**
     *
     */
    EMPTY_EFFECT_14(816),

    /**
     * Téléporte
     */
    TELEPORT_SIMPLE(825),

    /**
     * Voir la collection de cartes
     */
    VIEW_CARD_COLLECTION(856),

    /**
     * [NO_TRAD]
     */
    NO_TRANSLATION(857),

    /**
     * Lance un combat contre #2
     */
    START_FIGHT_AGAINST(905),

    /**
     * Augmente la sérénité, diminue l'agressivité
     */
    INCREASE_SERENITY(930),

    /**
     * Augmente l'agressivité, diminue la sérénité
     */
    INCREASE_AGGRESSIVITY(931),

    /**
     * Augmente l'endurance
     */
    INCREASE_ENDURANCE(932),

    /**
     * Diminue l'endurance
     */
    DECREASE_ENDURANCE(933),

    /**
     * Augmente l'amour
     */
    INCREASE_LOVE(934),

    /**
     * Diminue l'amour
     */
    DECREASE_LOVE(935),

    /**
     * Accelère la maturité
     */
    ACCELERATE_MATURITY(936),

    /**
     * Ralentit la maturité
     */
    SLOW_MATURITY(937),

    /**
     * Augmente les capacités d'un familier #3
     */
    INCREASE_FAMILIAR_ABILITIES(939),

    /**
     * Capacités accrues
     */
    ENHANCED_ABILITIES(940),

    /**
     * Donner un gène à une monture
     */
    GIVE_GENE_TO_MOUNT(945),

    /**
     * Retirer temporairement un objet d'élevage
     */
    TEMPORARILY_REMOVE_BREEDING_ITEM(946),

    /**
     * Récupérer un objet d'enclos
     */
    RECOVER_PADDOCK_ITEM(947),

    /**
     * Objet pour enclos
     */
    PADDOCK_ITEM(948),

    /**
     * Monter/Descendre d'une monture
     */
    MOUNT_DISMOUNT(949),

    /**
     * Etat #3
     */
    ADD_STATE(950),

    /**
     * Enlève l'état '#3'
     */
    REMOVE_STATE(951),

    /**
     * Alignement : #3
     */
    ALIGNMENT_INFO(960),

    /**
     * Grade : #3
     */
    GRADE_INFO(961),

    /**
     * Niveau : #3
     */
    LEVEL_INFO(962),

    /**
     * Créé depuis : #3 jour(s)
     */
    CREATED_SINCE(963),

    /**
     * Nom : #4
     */
    NAME_INFO(964),

    /**
     * Apparence : #3
     */
    APPEARANCE_INFO(969),

    /**
     *
     */
    EMPTY_EFFECT_15(970),

    /**
     *
     */
    EMPTY_EFFECT_16(971),

    /**
     *
     */
    EMPTY_EFFECT_17(972),

    /**
     *
     */
    EMPTY_EFFECT_18(973),

    /**
     *
     */
    EMPTY_EFFECT_19(974),

    /**
     *
     */
    EMPTY_EFFECT_20(975),

    /**
     * Échangeable dès le : #1
     */
    TRADEABLE_FROM(983),

    /**
     *
     */
    EMPTY_EFFECT_21(984),

    /**
     * Modifié par : #4
     */
    MODIFIED_BY(985),

    /**
     * Prépare #1{~1~2 à }#2 parchemins
     */
    PREPARE_SCROLLS(986),

    /**
     * Appartient à : #4
     */
    BELONGS_TO(987),

    /**
     * Fabriqué par : #4
     */
    CRAFTED_BY(988),

    /**
     * Recherche : #4
     */
    SEARCH(989),

    /**
     * #4
     */
    CUSTOM_INFO(990),

    /**
     * !! Certificat invalide !!
     */
    INVALID_CERTIFICATE(994),

    /**
     * Consulter la fiche de la monture
     */
    VIEW_MOUNT_SHEET(995),

    /**
     * Appartient à : #4
     */
    MOUNT_BELONGS_TO(996),

    /**
     * Nom : #4
     */
    MOUNT_NAME(997),

    /**
     * Validité : #1j #2h #3m
     */
    VALIDITY(998),

    /**
     *
     */
    EMPTY_EFFECT_22(999),

    /**
     * Gagner #1{~1~2 à }#2 kamas
     */
    GAIN_KAMAS_V2(2001),

    /**
     * Augmente les dommages finaux de #1{~1~2 à }#2%
     */
    INCREASE_FINAL_DAMAGE(2008),

    /**
     * Diminue les dommages finaux de #1{~1~2 à }#2%
     */
    DECREASE_FINAL_DAMAGE(2009),

    /**
     * +#1{~1~2 à }#2 charge(s)
     */
    ADD_CHARGES(2010),

    /**
     * -#1{~1~2 à -}#2 charge(s)
     */
    REMOVE_CHARGES(2011),

    /**
     * Gain d'XP : équivalent du niveau 1 à #1{~2 (+#2%)}
     */
    XP_GAIN_EQUIVALENT(2050),

    /**
     * PA perdus : #1{~1~2 à }#2
     */
    LOSE_AP_V2(2100),

    /**
     * Contient une carte Tragic The Gardening
     */
    CONTAINS_TRAGIC_CARD_1(2101),

    /**
     * Ajoute la carte au classeur
     */
    ADD_CARD_TO_BINDER(2102),

    /**
     * Contient une carte Tragic The Gardening
     */
    CONTAINS_TRAGIC_CARD_2(2107),

    /**
     * Diminue de #1{~1~2 à }#2 le renvoi de dommages
     */
    REDUCE_REFLECT_DAMAGE(2111),

    /**
     * -#1{~1~2 à }#2 créatures invocables
     */
    REDUCE_SUMMONS(2112),

    /**
     * -#1{~1~2 à }#2 de dommages aux pièges
     */
    REDUCE_TRAP_DAMAGE(2113),

    /**
     * -#1{~1~2 à }#2% de dommages aux pièges
     */
    REDUCE_TRAP_DAMAGE_PERCENT(2114),

    /**
     * Bonus supplémentaires :
     */
    BONUS_INFO(2116),

    /**
     * Pas de bonus !
     */
    NO_BONUS(2117),

    /**
     * -#1{~1~2 à }#2 en vie
     */
    REDUCE_LIFE(2118),

    /**
     * Réduit de #3 le coût en PA de l'arme
     */
    REDUCE_WEAPON_AP_COST(2123),

    /**
     * Augmente la portée de tous les sorts de #3
     */
    INCREASE_ALL_SPELLS_RANGE(2124),

    /**
     * Dommages : #1{~1~2 à }#2 (meilleur élément)
     */
    DAMAGE_BEST_ELEMENT(2126),

    /**
     * Fait avancer de #1 case(s)
     */
    PUSH_FORWARD_V2(2127),

    /**
     * Etat #3
     */
    ADD_STATE_V2(2128),

    /**
     * Enlève l'état '#3'
     */
    REMOVE_STATE_V2(2129),

    /**
     * Enregistre sa position
     */
    SAVE_POSITION_V2(2130),

    /**
     * Téléporte à la position précédente
     */
    TELEPORT_TO_PREVIOUS_POSITION(2131),

    /**
     * Pioche 1 carte
     */
    DRAW_CARD(2132),

    /**
     * Remélange les cartes
     */
    SHUFFLE_CARDS(2133),

    /**
     * Vole #1{~1~2 à }#2 PDV (meilleur élément)
     */
    STEAL_HP_BEST_ELEMENT(2134),

    /**
     * #1{~1~2 à -}#2 vol dans toutes les caractéristiques
     */
    STEAL_ALL_STATS(2135),

    /**
     * Dommages : #1{~1~2 à }#2% de la vie de l'attaquant (neutre)
     */
    DAMAGE_NEUTRAL_PERCENT_LIFE_V2(2136),

    /**
     * Etat #3
     */
    ADD_STATE_V3(2137),

    /**
     * +#3% de dommages sur le sort #1
     */
    ADD_SPELL_DAMAGE_PERCENT(2138),

    /**
     * Téléporte les cibles en symétrie
     */
    TELEPORT_SYMMETRY(2139),

    /**
     * Change l'élément de frappe
     */
    CHANGE_STRIKE_ELEMENT_V2(2142),

    /**
     * Téléporte : #1
     */
    TELEPORT_NAME(2143),

    /**
     * Ajoute un monstre au combat
     */
    ADD_MONSTER_TO_FIGHT(2144),

    /**
     * Progression : #2{~3,}#3%
     */
    PROGRESSION(2146),

    /**
     * Dévoreur d'âmes : valeur actuelle
     */
    SOUL_EATER_CURRENT(2147),

    /**
     * Dévoreur d'âmes : valeur max
     */
    SOUL_EATER_MAX(2148),

    /**
     * Résistance d'apparat : #2 / #3
     */
    CEREMONIAL_RESISTANCE(2149),

    /**
     *
     */
    EMPTY_EFFECT_23(2150),

    /**
     * Lié au personnage
     */
    BOUND_TO_CHARACTER(2151),

    /**
     * Donne #1 à #2 '#3'
     */
    GIVE_TO(2152),

    /**
     * Téléporte les membres du groupe
     */
    TELEPORT_GROUP_MEMBERS(2153),

    /**
     * Verrouillé au compte jusqu'au : #1
     */
    ACCOUNT_LOCKED_UNTIL(2154),

    /**
     * Verrouillé au compte (objet en favoris)
     */
    ACCOUNT_LOCKED_FAVORITE(2155),

    /**
     * Tu es rayonnant !
     */
    YOU_ARE_RADIANT(2156),

    /**
     * Augmente les dommages finaux reçus de #1{~1~2 à }#2%
     */
    INCREASE_FINAL_DAMAGE_RECEIVED(2157),

    /**
     * Diminue les dommages finaux reçus de #1{~1~2 à }#2%
     */
    DECREASE_FINAL_DAMAGE_RECEIVED(2158),

    /**
     * Domm. finaux infligés +#1{~1~3 à }#3%, reçus +#2{~2~4 à }#4%
     */
    FINAL_DAMAGE_COMBO(2159),

    /**
     * Donne +#3 jeton à la fin des combats
     */
    GIVE_TOKENS_END_FIGHT(2161),

    /**
     * Donne #3 jetons à la fin des combats par monstre tué
     */
    GIVE_TOKENS_PER_MONSTER(2162),

    /**
     * Donne #3 jetons à la fin des combats par tonique de sorts achetés (#1 sur #2)
     */
    GIVE_TOKENS_PER_TONIC(2163),

    /**
     * Donne #3 jetons à la fin des combats par nombre de réapprovisionnements effectués (#1 sur #2)
     */
    GIVE_TOKENS_PER_RESTOCK(2164),

    /**
     * +#3 permanent en #1 à la fin d'un combat
     */
    PERMANENT_STAT_GAIN(2165),

    /**
     * Augmente de #3% le gain en #1 de base obtenu après une victoire
     */
    INCREASE_BASE_STAT_GAIN(2166),

    /**
     * #1{~1~2 à -}#2 vol de dommages
     */
    STEAL_DAMAGE(2169),

    /**
     * #1{~1~2 à -}#2 vol de coups critiques
     */
    STEAL_CRITICAL(2170),

    /**
     * PDV rendus : #1{~1~2 à }#2
     */
    HEAL_HP_V2(2171),

    /**
     * Augmente de #2 le niveau du sort #3
     */
    INCREASE_SPELL_LEVEL(2172),

    /**
     * Change les effets du sort #3 en meilleur élément
     */
    CHANGE_SPELL_TO_BEST_ELEMENT(2173),

    /**
     * Dommages : #1{~1~2 à }#2% de la vie de l'attaquant (terre)
     */
    DAMAGE_EARTH_PERCENT_LIFE_V2(2174),

    /**
     * Dommages : #1{~1~2 à }#2% de la vie de l'attaquant (meilleur élément)
     */
    DAMAGE_BEST_ELEMENT_PERCENT_LIFE(2175),

    /**
     * +#1% d'XP en combat en couple
     */
    COUPLE_XP_BONUS(2179),

    /**
     * Objet évolutif : Apparence #3 sur #1
     */
    EVOLUTIONARY_ITEM(2184);

    private final int id;

    Effects(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static Effects getById(int id) {
        for (Effects effect : values()) {
            if (effect.id == id) {
                return effect;
            }
        }
        throw new IllegalArgumentException("No Effects found for id: " + id);
    }
}