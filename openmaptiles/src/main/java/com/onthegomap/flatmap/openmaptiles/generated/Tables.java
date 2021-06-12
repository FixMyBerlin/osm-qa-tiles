// AUTOGENERATED BY Generate.java -- DO NOT MODIFY
package com.onthegomap.flatmap.openmaptiles.generated;

import static com.onthegomap.flatmap.openmaptiles.Expression.*;
import com.onthegomap.flatmap.openmaptiles.Expression;
import com.onthegomap.flatmap.openmaptiles.MultiExpression;
import java.util.Map;

public class Tables {
  public interface Table {}
  public static record OsmWaterPolygon(com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, String natural, String landuse, String waterway, boolean isIntermittent, boolean isTunnel, boolean isBridge) implements Table {
    public OsmWaterPolygon(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"), source.getString("natural"), source.getString("landuse"), source.getString("waterway"), source.getBoolean("intermittent"), source.getBoolean("tunnel"), source.getBoolean("bridge"));
    }
    public static final Expression MAPPING = and(or(matchAny("landuse", "reservoir", "basin", "salt_pond"), matchAny("leisure", "swimming_pool"), matchAny("natural", "water", "bay"), matchAny("waterway", "river", "riverbank", "stream", "canal", "drain", "ditch", "dock")), not(matchAny("covered", "yes")));
  }
  public static record OsmWaterwayLinestring(com.onthegomap.flatmap.SourceFeature source, String waterway, String name, String nameEn, String nameDe, boolean isTunnel, boolean isBridge, boolean isIntermittent) implements Table {
    public OsmWaterwayLinestring(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("waterway"), source.getString("name"), source.getString("name:en"), source.getString("name:de"), source.getBoolean("tunnel"), source.getBoolean("bridge"), source.getBoolean("intermittent"));
    }
    public static final Expression MAPPING = matchAny("waterway", "stream", "river", "canal", "drain", "ditch");
  }
  public static record OsmLandcoverPolygon(com.onthegomap.flatmap.SourceFeature source) implements Table {
    public static final Expression MAPPING = or(matchAny("landuse", "allotments", "farm", "farmland", "orchard", "plant_nursery", "vineyard", "grass", "grassland", "meadow", "forest", "village_green", "recreation_ground", "park"), matchAny("natural", "wood", "wetland", "fell", "grassland", "heath", "scrub", "tundra", "glacier", "bare_rock", "scree", "beach", "sand", "dune"), matchAny("leisure", "park", "garden", "golf_course"), matchAny("wetland", "bog", "swamp", "wet_meadow", "marsh", "reedbed", "saltern", "tidalflat", "saltmarsh", "mangrove"));
  }
  public static record OsmLandusePolygon(com.onthegomap.flatmap.SourceFeature source, String landuse, String amenity, String leisure, String tourism, String place, String waterway) implements Table {
    public OsmLandusePolygon(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("landuse"), source.getString("amenity"), source.getString("leisure"), source.getString("tourism"), source.getString("place"), source.getString("waterway"));
    }
    public static final Expression MAPPING = or(matchAny("landuse", "railway", "cemetery", "military", "residential", "commercial", "industrial", "garages", "retail"), matchAny("amenity", "bus_station", "school", "university", "kindergarten", "college", "library", "hospital"), matchAny("leisure", "stadium", "pitch", "playground", "track"), matchAny("tourism", "theme_park", "zoo"), matchAny("place", "suburb", "quarter", "neighbourhood"), matchAny("waterway", "dam"));
  }
  public static record OsmPeakPoint(com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, String ele, String wikipedia) implements Table {
    public OsmPeakPoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"), source.getString("ele"), source.getString("wikipedia"));
    }
    public static final Expression MAPPING = matchAny("natural", "peak", "volcano");
  }
  public static record OsmParkPolygon(com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, String landuse, String leisure, String boundary, String protectionTitle) implements Table {
    public OsmParkPolygon(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"), source.getString("landuse"), source.getString("leisure"), source.getString("boundary"), source.getString("protection_title"));
    }
    public static final Expression MAPPING = or(matchAny("leisure", "nature_reserve"), matchAny("boundary", "national_park", "protected_area"));
  }
  public static record OsmBorderDispRelation(com.onthegomap.flatmap.SourceFeature source, String name, String boundary, long adminLevel, String claimedBy, String disputedBy, boolean maritime) implements Table {
    public OsmBorderDispRelation(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("boundary"), source.getLong("admin_level"), source.getString("claimed_by"), source.getString("disputed_by"), source.getBoolean("maritime"));
    }
    public static final Expression MAPPING = and(matchAny("type", "boundary"), matchField("admin_level"), matchField("claimed_by"));
  }
  public static record OsmAerowayPolygon(com.onthegomap.flatmap.SourceFeature source, String ref) implements Table {
    public OsmAerowayPolygon(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("ref"));
    }
    public static final Expression MAPPING = or(matchAny("aeroway", "aerodrome", "heliport", "runway", "helipad", "taxiway", "apron"), matchAny("area:aeroway", "aerodrome", "heliport", "runway", "helipad", "taxiway", "apron"));
  }
  public static record OsmAerowayLinestring(com.onthegomap.flatmap.SourceFeature source, String ref, String aeroway) implements Table {
    public OsmAerowayLinestring(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("ref"), source.getString("aeroway"));
    }
    public static final Expression MAPPING = matchAny("aeroway", "runway", "taxiway");
  }
  public static record OsmAerowayPoint(com.onthegomap.flatmap.SourceFeature source, String ref, String aeroway) implements Table {
    public OsmAerowayPoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("ref"), source.getString("aeroway"));
    }
    public static final Expression MAPPING = matchAny("aeroway", "gate");
  }
  public static record OsmHighwayLinestring(com.onthegomap.flatmap.SourceFeature source, String highway, String construction, String ref, String network, int zOrder, long layer, long level, boolean indoor, String name, String nameEn, String nameDe, String shortName, boolean isTunnel, boolean isBridge, boolean isRamp, boolean isFord, int isOneway, boolean isArea, String service, String usage, String publicTransport, String manMade, String bicycle, String foot, String horse, String mtbScale, String surface) implements Table {
    public OsmHighwayLinestring(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("highway"), source.getString("construction"), source.getString("ref"), source.getString("network"), source.getWayZorder(), source.getLong("layer"), source.getLong("level"), source.getBoolean("indoor"), source.getString("name"), source.getString("name:en"), source.getString("name:de"), source.getString("short_name"), source.getBoolean("tunnel"), source.getBoolean("bridge"), source.getBoolean("ramp"), source.getBoolean("ford"), source.getDirection("oneway"), source.getBoolean("area"), source.getString("service"), source.getString("usage"), source.getString("public_transport"), source.getString("man_made"), source.getString("bicycle"), source.getString("foot"), source.getString("horse"), source.getString("mtb:scale"), source.getString("surface"));
    }
    public static final Expression MAPPING = or(matchAny("highway", "motorway", "motorway_link", "trunk", "trunk_link", "primary", "primary_link", "secondary", "secondary_link", "tertiary", "tertiary_link", "unclassified", "residential", "living_street", "road", "pedestrian", "path", "footway", "cycleway", "steps", "bridleway", "corridor", "service", "track", "raceway", "construction"), matchAny("public_transport", "platform"), matchAny("man_made", "pier"));
  }
  public static record OsmRailwayLinestring(com.onthegomap.flatmap.SourceFeature source, String railway, String ref, String network, int zOrder, long layer, long level, boolean indoor, String name, String nameEn, String nameDe, String shortName, boolean isTunnel, boolean isBridge, boolean isRamp, boolean isFord, int isOneway, boolean isArea, String service, String usage) implements Table {
    public OsmRailwayLinestring(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("railway"), source.getString("ref"), source.getString("network"), source.getWayZorder(), source.getLong("layer"), source.getLong("level"), source.getBoolean("indoor"), source.getString("name"), source.getString("name:en"), source.getString("name:de"), source.getString("short_name"), source.getBoolean("tunnel"), source.getBoolean("bridge"), source.getBoolean("ramp"), source.getBoolean("ford"), source.getDirection("oneway"), source.getBoolean("area"), source.getString("service"), source.getString("usage"));
    }
    public static final Expression MAPPING = matchAny("railway", "rail", "narrow_gauge", "preserved", "funicular", "subway", "light_rail", "monorail", "tram");
  }
  public static record OsmAerialwayLinestring(com.onthegomap.flatmap.SourceFeature source, String aerialway, int zOrder, long layer, String name, String nameEn, String nameDe, String shortName, boolean isTunnel, boolean isBridge, boolean isRamp, boolean isFord, int isOneway, boolean isArea, String service, String usage) implements Table {
    public OsmAerialwayLinestring(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("aerialway"), source.getWayZorder(), source.getLong("layer"), source.getString("name"), source.getString("name:en"), source.getString("name:de"), source.getString("short_name"), source.getBoolean("tunnel"), source.getBoolean("bridge"), source.getBoolean("ramp"), source.getBoolean("ford"), source.getDirection("oneway"), source.getBoolean("area"), source.getString("service"), source.getString("usage"));
    }
    public static final Expression MAPPING = matchAny("aerialway", "cable_car", "gondola");
  }
  public static record OsmShipwayLinestring(com.onthegomap.flatmap.SourceFeature source, String shipway, int zOrder, long layer, String name, String nameEn, String nameDe, String shortName, boolean isTunnel, boolean isBridge, boolean isRamp, boolean isFord, int isOneway, boolean isArea, String service, String usage) implements Table {
    public OsmShipwayLinestring(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("route"), source.getWayZorder(), source.getLong("layer"), source.getString("name"), source.getString("name:en"), source.getString("name:de"), source.getString("short_name"), source.getBoolean("tunnel"), source.getBoolean("bridge"), source.getBoolean("ramp"), source.getBoolean("ford"), source.getDirection("oneway"), source.getBoolean("area"), source.getString("service"), source.getString("usage"));
    }
    public static final Expression MAPPING = matchAny("route", "ferry");
  }
  public static record OsmHighwayPolygon(com.onthegomap.flatmap.SourceFeature source, String highway, int zOrder, long layer, long level, boolean indoor, boolean isArea, String publicTransport, String manMade) implements Table {
    public OsmHighwayPolygon(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("highway"), source.getWayZorder(), source.getLong("layer"), source.getLong("level"), source.getBoolean("indoor"), source.getBoolean("area"), source.getString("public_transport"), source.getString("man_made"));
    }
    public static final Expression MAPPING = or(matchAny("highway", "path", "cycleway", "bridleway", "footway", "corridor", "pedestrian", "steps"), matchAny("public_transport", "platform"), matchAny("man_made", "bridge", "pier"));
  }
  public static record OsmRouteMember(com.onthegomap.flatmap.SourceFeature source, String ref, String network, String name) implements Table {
    public OsmRouteMember(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("ref"), source.getString("network"), source.getString("name"));
    }
    public static final Expression MAPPING = matchAny("route", "road");
  }
  public static record OsmBuildingPolygon(com.onthegomap.flatmap.SourceFeature source, String material, String colour, String building, String buildingpart, String buildingheight, String buildingminHeight, String buildinglevels, String buildingminLevel, String height, String minHeight, String levels, String minLevel) implements Table {
    public OsmBuildingPolygon(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("building:material"), source.getString("building:colour"), source.getString("building"), source.getString("building:part"), source.getString("building:height"), source.getString("building:min_height"), source.getString("building:levels"), source.getString("building:min_level"), source.getString("height"), source.getString("min_height"), source.getString("levels"), source.getString("min_level"));
    }
    public static final Expression MAPPING = and(or(matchField("building:part"), matchField("building"), matchAny("aeroway", "terminal", "hangar")), not(matchAny("building", "no", "none", "No")), not(matchAny("building:part", "no", "none", "No")), not(matchAny("man_made", "bridge")));
  }
  public static record OsmBuildingRelation(com.onthegomap.flatmap.SourceFeature source, String building, String material, String colour, String buildingpart, String buildingheight, String height, String buildingminHeight, String minHeight, String buildinglevels, String levels, String buildingminLevel, String minLevel, String relbuildingheight, String relheight, String relbuildingminHeight, String relminHeight, String relbuildinglevels, String rellevels, String relbuildingminLevel, String relminLevel) implements Table {
    public OsmBuildingRelation(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("building"), source.getString("building:material"), source.getString("building:colour"), source.getString("building:part"), source.getString("building:height"), source.getString("height"), source.getString("building:min_height"), source.getString("min_height"), source.getString("building:levels"), source.getString("levels"), source.getString("building:min_level"), source.getString("min_level"), source.getString("building:height"), source.getString("height"), source.getString("building:min_height"), source.getString("min_height"), source.getString("building:levels"), source.getString("levels"), source.getString("building:min_level"), source.getString("min_level"));
    }
    public static final Expression MAPPING = matchAny("type", "building");
  }
  public static record OsmMarinePoint(com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, String place, long rank, boolean isIntermittent) implements Table {
    public OsmMarinePoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"), source.getString("place"), source.getLong("rank"), source.getBoolean("intermittent"));
    }
    public static final Expression MAPPING = and(matchAny("place", "ocean", "sea"), matchField("name"));
  }
  public static record OsmContinentPoint(com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe) implements Table {
    public OsmContinentPoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"));
    }
    public static final Expression MAPPING = and(matchAny("place", "continent"), matchField("name"));
  }
  public static record OsmCountryPoint(com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, long rank, String countryCodeIso31661Alpha2, String iso31661Alpha2, String iso31661) implements Table {
    public OsmCountryPoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"), source.getLong("rank"), source.getString("country_code_iso3166_1_alpha_2"), source.getString("ISO3166-1:alpha2"), source.getString("ISO3166-1"));
    }
    public static final Expression MAPPING = and(matchAny("place", "country"), matchField("name"));
  }
  public static record OsmIslandPolygon(com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, long rank) implements Table {
    public OsmIslandPolygon(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"), source.getLong("rank"));
    }
    public static final Expression MAPPING = and(matchAny("place", "island"), matchField("name"));
  }
  public static record OsmIslandPoint(com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, long rank) implements Table {
    public OsmIslandPoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"), source.getLong("rank"));
    }
    public static final Expression MAPPING = and(matchAny("place", "island"), matchField("name"));
  }
  public static record OsmStatePoint(com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, String isInCountry, String isInCountryCode, String ref, long rank) implements Table {
    public OsmStatePoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"), source.getString("is_in:country"), source.getString("is_in:country_code"), source.getString("ref"), source.getLong("rank"));
    }
    public static final Expression MAPPING = and(matchAny("place", "state"), matchField("name"));
  }
  public static record OsmCityPoint(com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, String place, long population, String capital, long rank) implements Table {
    public OsmCityPoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"), source.getString("place"), source.getLong("population"), source.getString("capital"), source.getLong("rank"));
    }
    public static final Expression MAPPING = and(matchAny("place", "city", "town", "village", "hamlet", "suburb", "quarter", "neighbourhood", "isolated_dwelling"), matchField("name"));
  }
  public static record OsmHousenumberPoint(com.onthegomap.flatmap.SourceFeature source, String housenumber) implements Table {
    public OsmHousenumberPoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("addr:housenumber"));
    }
    public static final Expression MAPPING = or();
  }
  public static record OsmPoiPoint(com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, String station, String funicular, String information, String uicRef, String religion, long level, boolean indoor, long layer, String sport) implements Table {
    public OsmPoiPoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"), source.getString("station"), source.getString("funicular"), source.getString("information"), source.getString("uic_ref"), source.getString("religion"), source.getLong("level"), source.getBoolean("indoor"), source.getLong("layer"), source.getString("sport"));
    }
    public static final Expression MAPPING = or(matchAny("aerialway", "station"), matchAny("amenity", "arts_centre", "bank", "bar", "bbq", "bicycle_parking", "bicycle_rental", "biergarten", "bus_station", "cafe", "cinema", "clinic", "college", "community_centre", "courthouse", "dentist", "doctors", "drinking_water", "embassy", "fast_food", "ferry_terminal", "fire_station", "food_court", "fuel", "grave_yard", "hospital", "ice_cream", "kindergarten", "library", "marketplace", "motorcycle_parking", "nightclub", "nursing_home", "parking", "pharmacy", "place_of_worship", "police", "post_box", "post_office", "prison", "pub", "public_building", "recycling", "restaurant", "school", "shelter", "swimming_pool", "taxi", "telephone", "theatre", "toilets", "townhall", "university", "veterinary", "waste_basket"), matchAny("barrier", "bollard", "border_control", "cycle_barrier", "gate", "lift_gate", "sally_port", "stile", "toll_booth"), matchAny("building", "dormitory"), matchAny("highway", "bus_stop"), matchAny("historic", "monument", "castle", "ruins"), matchAny("landuse", "basin", "brownfield", "cemetery", "reservoir", "winter_sports"), matchAny("leisure", "dog_park", "escape_game", "garden", "golf_course", "ice_rink", "hackerspace", "marina", "miniature_golf", "park", "pitch", "playground", "sports_centre", "stadium", "swimming_area", "swimming_pool", "water_park"), matchAny("railway", "halt", "station", "subway_entrance", "train_station_entrance", "tram_stop"), matchAny("shop", "accessories", "alcohol", "antiques", "art", "bag", "bakery", "beauty", "bed", "beverages", "bicycle", "books", "boutique", "butcher", "camera", "car", "car_repair", "car_parts", "carpet", "charity", "chemist", "chocolate", "clothes", "coffee", "computer", "confectionery", "convenience", "copyshop", "cosmetics", "deli", "delicatessen", "department_store", "doityourself", "dry_cleaning", "electronics", "erotic", "fabric", "florist", "frozen_food", "furniture", "garden_centre", "general", "gift", "greengrocer", "hairdresser", "hardware", "hearing_aids", "hifi", "ice_cream", "interior_decoration", "jewelry", "kiosk", "lamps", "laundry", "mall", "massage", "mobile_phone", "motorcycle", "music", "musical_instrument", "newsagent", "optician", "outdoor", "perfume", "perfumery", "pet", "photo", "second_hand", "shoes", "sports", "stationery", "supermarket", "tailor", "tattoo", "ticket", "tobacco", "toys", "travel_agency", "video", "video_games", "watches", "weapons", "wholesale", "wine"), matchAny("sport", "american_football", "archery", "athletics", "australian_football", "badminton", "baseball", "basketball", "beachvolleyball", "billiards", "bmx", "boules", "bowls", "boxing", "canadian_football", "canoe", "chess", "climbing", "climbing_adventure", "cricket", "cricket_nets", "croquet", "curling", "cycling", "disc_golf", "diving", "dog_racing", "equestrian", "fatsal", "field_hockey", "free_flying", "gaelic_games", "golf", "gymnastics", "handball", "hockey", "horse_racing", "horseshoes", "ice_hockey", "ice_stock", "judo", "karting", "korfball", "long_jump", "model_aerodrome", "motocross", "motor", "multi", "netball", "orienteering", "paddle_tennis", "paintball", "paragliding", "pelota", "racquet", "rc_car", "rowing", "rugby", "rugby_league", "rugby_union", "running", "sailing", "scuba_diving", "shooting", "shooting_range", "skateboard", "skating", "skiing", "soccer", "surfing", "swimming", "table_soccer", "table_tennis", "team_handball", "tennis", "toboggan", "volleyball", "water_ski", "yoga"), matchAny("tourism", "alpine_hut", "aquarium", "artwork", "attraction", "bed_and_breakfast", "camp_site", "caravan_site", "chalet", "gallery", "guest_house", "hostel", "hotel", "information", "motel", "museum", "picnic_site", "theme_park", "viewpoint", "zoo"), matchAny("waterway", "dock"));
  }
  public static record OsmPoiPolygon(com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, String station, String funicular, String information, String uicRef, String religion, long level, boolean indoor, long layer, String sport) implements Table {
    public OsmPoiPolygon(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"), source.getString("station"), source.getString("funicular"), source.getString("information"), source.getString("uic_ref"), source.getString("religion"), source.getLong("level"), source.getBoolean("indoor"), source.getLong("layer"), source.getString("sport"));
    }
    public static final Expression MAPPING = or(matchAny("aerialway", "station"), matchAny("amenity", "arts_centre", "bank", "bar", "bbq", "bicycle_parking", "bicycle_rental", "biergarten", "bus_station", "cafe", "cinema", "clinic", "college", "community_centre", "courthouse", "dentist", "doctors", "drinking_water", "embassy", "fast_food", "ferry_terminal", "fire_station", "food_court", "fuel", "grave_yard", "hospital", "ice_cream", "kindergarten", "library", "marketplace", "motorcycle_parking", "nightclub", "nursing_home", "parking", "pharmacy", "place_of_worship", "police", "post_box", "post_office", "prison", "pub", "public_building", "recycling", "restaurant", "school", "shelter", "swimming_pool", "taxi", "telephone", "theatre", "toilets", "townhall", "university", "veterinary", "waste_basket"), matchAny("barrier", "bollard", "border_control", "cycle_barrier", "gate", "lift_gate", "sally_port", "stile", "toll_booth"), matchAny("building", "dormitory"), matchAny("highway", "bus_stop"), matchAny("historic", "monument", "castle", "ruins"), matchAny("landuse", "basin", "brownfield", "cemetery", "reservoir", "winter_sports"), matchAny("leisure", "dog_park", "escape_game", "garden", "golf_course", "ice_rink", "hackerspace", "marina", "miniature_golf", "park", "pitch", "playground", "sports_centre", "stadium", "swimming_area", "swimming_pool", "water_park"), matchAny("railway", "halt", "station", "subway_entrance", "train_station_entrance", "tram_stop"), matchAny("shop", "accessories", "alcohol", "antiques", "art", "bag", "bakery", "beauty", "bed", "beverages", "bicycle", "books", "boutique", "butcher", "camera", "car", "car_repair", "car_parts", "carpet", "charity", "chemist", "chocolate", "clothes", "coffee", "computer", "confectionery", "convenience", "copyshop", "cosmetics", "deli", "delicatessen", "department_store", "doityourself", "dry_cleaning", "electronics", "erotic", "fabric", "florist", "frozen_food", "furniture", "garden_centre", "general", "gift", "greengrocer", "hairdresser", "hardware", "hearing_aids", "hifi", "ice_cream", "interior_decoration", "jewelry", "kiosk", "lamps", "laundry", "mall", "massage", "mobile_phone", "motorcycle", "music", "musical_instrument", "newsagent", "optician", "outdoor", "perfume", "perfumery", "pet", "photo", "second_hand", "shoes", "sports", "stationery", "supermarket", "tailor", "tattoo", "ticket", "tobacco", "toys", "travel_agency", "video", "video_games", "watches", "weapons", "wholesale", "wine"), matchAny("sport", "american_football", "archery", "athletics", "australian_football", "badminton", "baseball", "basketball", "beachvolleyball", "billiards", "bmx", "boules", "bowls", "boxing", "canadian_football", "canoe", "chess", "climbing", "climbing_adventure", "cricket", "cricket_nets", "croquet", "curling", "cycling", "disc_golf", "diving", "dog_racing", "equestrian", "fatsal", "field_hockey", "free_flying", "gaelic_games", "golf", "gymnastics", "handball", "hockey", "horse_racing", "horseshoes", "ice_hockey", "ice_stock", "judo", "karting", "korfball", "long_jump", "model_aerodrome", "motocross", "motor", "multi", "netball", "orienteering", "paddle_tennis", "paintball", "paragliding", "pelota", "racquet", "rc_car", "rowing", "rugby", "rugby_league", "rugby_union", "running", "sailing", "scuba_diving", "shooting", "shooting_range", "skateboard", "skating", "skiing", "soccer", "surfing", "swimming", "table_soccer", "table_tennis", "team_handball", "tennis", "toboggan", "volleyball", "water_ski", "yoga"), matchAny("tourism", "alpine_hut", "aquarium", "artwork", "attraction", "bed_and_breakfast", "camp_site", "caravan_site", "chalet", "gallery", "guest_house", "hostel", "hotel", "information", "motel", "museum", "picnic_site", "theme_park", "viewpoint", "zoo"), matchAny("waterway", "dock"));
  }
  public static record OsmAerodromeLabelPoint(com.onthegomap.flatmap.SourceFeature source, String name, String nameEn, String nameDe, String aerodromeType, String aerodrome, String military, String iata, String icao, String ele) implements Table {
    public OsmAerodromeLabelPoint(com.onthegomap.flatmap.SourceFeature source) {
      this(source, source.getString("name"), source.getString("name:en"), source.getString("name:de"), source.getString("aerodrome:type"), source.getString("aerodrome"), source.getString("military"), source.getString("iata"), source.getString("icao"), source.getString("ele"));
    }
    public static final Expression MAPPING = or();
  }
  public static final MultiExpression<java.util.function.Function<com.onthegomap.flatmap.SourceFeature, Table>> MAPPINGS = MultiExpression.of(Map.ofEntries(
    Map.entry(OsmWaterPolygon::new, OsmWaterPolygon.MAPPING),
    Map.entry(OsmWaterwayLinestring::new, OsmWaterwayLinestring.MAPPING),
    Map.entry(OsmLandcoverPolygon::new, OsmLandcoverPolygon.MAPPING),
    Map.entry(OsmLandusePolygon::new, OsmLandusePolygon.MAPPING),
    Map.entry(OsmPeakPoint::new, OsmPeakPoint.MAPPING),
    Map.entry(OsmParkPolygon::new, OsmParkPolygon.MAPPING),
    Map.entry(OsmBorderDispRelation::new, OsmBorderDispRelation.MAPPING),
    Map.entry(OsmAerowayPolygon::new, OsmAerowayPolygon.MAPPING),
    Map.entry(OsmAerowayLinestring::new, OsmAerowayLinestring.MAPPING),
    Map.entry(OsmAerowayPoint::new, OsmAerowayPoint.MAPPING),
    Map.entry(OsmHighwayLinestring::new, OsmHighwayLinestring.MAPPING),
    Map.entry(OsmRailwayLinestring::new, OsmRailwayLinestring.MAPPING),
    Map.entry(OsmAerialwayLinestring::new, OsmAerialwayLinestring.MAPPING),
    Map.entry(OsmShipwayLinestring::new, OsmShipwayLinestring.MAPPING),
    Map.entry(OsmHighwayPolygon::new, OsmHighwayPolygon.MAPPING),
    Map.entry(OsmRouteMember::new, OsmRouteMember.MAPPING),
    Map.entry(OsmBuildingPolygon::new, OsmBuildingPolygon.MAPPING),
    Map.entry(OsmBuildingRelation::new, OsmBuildingRelation.MAPPING),
    Map.entry(OsmMarinePoint::new, OsmMarinePoint.MAPPING),
    Map.entry(OsmContinentPoint::new, OsmContinentPoint.MAPPING),
    Map.entry(OsmCountryPoint::new, OsmCountryPoint.MAPPING),
    Map.entry(OsmIslandPolygon::new, OsmIslandPolygon.MAPPING),
    Map.entry(OsmIslandPoint::new, OsmIslandPoint.MAPPING),
    Map.entry(OsmStatePoint::new, OsmStatePoint.MAPPING),
    Map.entry(OsmCityPoint::new, OsmCityPoint.MAPPING),
    Map.entry(OsmHousenumberPoint::new, OsmHousenumberPoint.MAPPING),
    Map.entry(OsmPoiPoint::new, OsmPoiPoint.MAPPING),
    Map.entry(OsmPoiPolygon::new, OsmPoiPolygon.MAPPING),
    Map.entry(OsmAerodromeLabelPoint::new, OsmAerodromeLabelPoint.MAPPING)
  ));
}