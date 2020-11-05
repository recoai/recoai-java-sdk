// To use this code, add the following Maven dependency to your project:
//
//
//     com.fasterxml.jackson.core     : jackson-databind          : 2.9.0
//     com.fasterxml.jackson.datatype : jackson-datatype-jsr310   : 2.9.0
//
// Import this package:
//
//     import net.recoai.models.Converter;
//
// Then you can deserialize a JSON string with
//
//     AddToCart data = Converter.AddToCartFromJsonString(jsonString);
//     AddToList data = Converter.AddToListFromJsonString(jsonString);
//     APISettings data = Converter.APISettingsFromJsonString(jsonString);
//     CategoryPageView data = Converter.CategoryPageViewFromJsonString(jsonString);
//     CheckoutStart data = Converter.CheckoutStartFromJsonString(jsonString);
//     Object data = Converter.CommonFromJsonString(jsonString);
//     DetailProductView data = Converter.DetailProductViewFromJsonString(jsonString);
//     HomePageView data = Converter.HomePageViewFromJsonString(jsonString);
//     ImageInteraction data = Converter.ImageInteractionFromJsonString(jsonString);
//     RemoveItem data = Converter.RemoveItemFromJsonString(jsonString);
//     UpsertItem data = Converter.UpsertItemFromJsonString(jsonString);
//     ListView data = Converter.ListViewFromJsonString(jsonString);
//     OfflineRecommendationsRemove data = Converter.OfflineRecommendationsRemoveFromJsonString(jsonString);
//     OfflineRecommendationsUpsert data = Converter.OfflineRecommendationsUpsertFromJsonString(jsonString);
//     OtherInteraction data = Converter.OtherInteractionFromJsonString(jsonString);
//     PageVisit data = Converter.PageVisitFromJsonString(jsonString);
//     PlacementRemove data = Converter.PlacementRemoveFromJsonString(jsonString);
//     PlacementUpsert data = Converter.PlacementUpsertFromJsonString(jsonString);
//     PurchaseComplete data = Converter.PurchaseCompleteFromJsonString(jsonString);
//     RateProduct data = Converter.RateProductFromJsonString(jsonString);
//     RecoRequest data = Converter.RecoRequestFromJsonString(jsonString);
//     RecoShow data = Converter.RecoShowFromJsonString(jsonString);
//     RemoveFromCart data = Converter.RemoveFromCartFromJsonString(jsonString);
//     RemoveFromList data = Converter.RemoveFromListFromJsonString(jsonString);
//     CartPageView data = Converter.CartPageViewFromJsonString(jsonString);
//     SortItems data = Converter.SortItemsFromJsonString(jsonString);
//     UnknownEvent data = Converter.UnknownEventFromJsonString(jsonString);

package net.recoai.models;

import java.io.IOException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Converter {
    // Date-time helpers

    private static final DateTimeFormatter DATE_TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_INSTANT)
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetDateTime parseDateTimeString(String str) {
        return ZonedDateTime.from(Converter.DATE_TIME_FORMATTER.parse(str)).toOffsetDateTime();
    }

    private static final DateTimeFormatter TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_TIME)
            .parseDefaulting(ChronoField.YEAR, 2020)
            .parseDefaulting(ChronoField.MONTH_OF_YEAR, 1)
            .parseDefaulting(ChronoField.DAY_OF_MONTH, 1)
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetTime parseTimeString(String str) {
        return ZonedDateTime.from(Converter.TIME_FORMATTER.parse(str)).toOffsetDateTime().toOffsetTime();
    }
    // Serialize/deserialize helpers

    public static AddToCart AddToCartFromJsonString(String json) throws IOException {
        return getAddToCartObjectReader().readValue(json);
    }

    public static String AddToCartToJsonString(AddToCart obj) throws JsonProcessingException {
        return getAddToCartObjectWriter().writeValueAsString(obj);
    }

    public static AddToList AddToListFromJsonString(String json) throws IOException {
        return getAddToListObjectReader().readValue(json);
    }

    public static String AddToListToJsonString(AddToList obj) throws JsonProcessingException {
        return getAddToListObjectWriter().writeValueAsString(obj);
    }

    public static APISettings APISettingsFromJsonString(String json) throws IOException {
        return getAPISettingsObjectReader().readValue(json);
    }

    public static String APISettingsToJsonString(APISettings obj) throws JsonProcessingException {
        return getAPISettingsObjectWriter().writeValueAsString(obj);
    }

    public static CategoryPageView CategoryPageViewFromJsonString(String json) throws IOException {
        return getCategoryPageViewObjectReader().readValue(json);
    }

    public static String CategoryPageViewToJsonString(CategoryPageView obj) throws JsonProcessingException {
        return getCategoryPageViewObjectWriter().writeValueAsString(obj);
    }

    public static CheckoutStart CheckoutStartFromJsonString(String json) throws IOException {
        return getCheckoutStartObjectReader().readValue(json);
    }

    public static String CheckoutStartToJsonString(CheckoutStart obj) throws JsonProcessingException {
        return getCheckoutStartObjectWriter().writeValueAsString(obj);
    }

    public static Object CommonFromJsonString(String json) throws IOException {
        return getCommonObjectReader().readValue(json);
    }

    public static String CommonToJsonString(Object obj) throws JsonProcessingException {
        return getCommonObjectWriter().writeValueAsString(obj);
    }

    public static DetailProductView DetailProductViewFromJsonString(String json) throws IOException {
        return getDetailProductViewObjectReader().readValue(json);
    }

    public static String DetailProductViewToJsonString(DetailProductView obj) throws JsonProcessingException {
        return getDetailProductViewObjectWriter().writeValueAsString(obj);
    }

    public static HomePageView HomePageViewFromJsonString(String json) throws IOException {
        return getHomePageViewObjectReader().readValue(json);
    }

    public static String HomePageViewToJsonString(HomePageView obj) throws JsonProcessingException {
        return getHomePageViewObjectWriter().writeValueAsString(obj);
    }

    public static ImageInteraction ImageInteractionFromJsonString(String json) throws IOException {
        return getImageInteractionObjectReader().readValue(json);
    }

    public static String ImageInteractionToJsonString(ImageInteraction obj) throws JsonProcessingException {
        return getImageInteractionObjectWriter().writeValueAsString(obj);
    }

    public static RemoveItem RemoveItemFromJsonString(String json) throws IOException {
        return getRemoveItemObjectReader().readValue(json);
    }

    public static String RemoveItemToJsonString(RemoveItem obj) throws JsonProcessingException {
        return getRemoveItemObjectWriter().writeValueAsString(obj);
    }

    public static UpsertItem UpsertItemFromJsonString(String json) throws IOException {
        return getUpsertItemObjectReader().readValue(json);
    }

    public static String UpsertItemToJsonString(UpsertItem obj) throws JsonProcessingException {
        return getUpsertItemObjectWriter().writeValueAsString(obj);
    }

    public static ListView ListViewFromJsonString(String json) throws IOException {
        return getListViewObjectReader().readValue(json);
    }

    public static String ListViewToJsonString(ListView obj) throws JsonProcessingException {
        return getListViewObjectWriter().writeValueAsString(obj);
    }

    public static OfflineRecommendationsRemove OfflineRecommendationsRemoveFromJsonString(String json) throws IOException {
        return getOfflineRecommendationsRemoveObjectReader().readValue(json);
    }

    public static String OfflineRecommendationsRemoveToJsonString(OfflineRecommendationsRemove obj) throws JsonProcessingException {
        return getOfflineRecommendationsRemoveObjectWriter().writeValueAsString(obj);
    }

    public static OfflineRecommendationsUpsert OfflineRecommendationsUpsertFromJsonString(String json) throws IOException {
        return getOfflineRecommendationsUpsertObjectReader().readValue(json);
    }

    public static String OfflineRecommendationsUpsertToJsonString(OfflineRecommendationsUpsert obj) throws JsonProcessingException {
        return getOfflineRecommendationsUpsertObjectWriter().writeValueAsString(obj);
    }

    public static OtherInteraction OtherInteractionFromJsonString(String json) throws IOException {
        return getOtherInteractionObjectReader().readValue(json);
    }

    public static String OtherInteractionToJsonString(OtherInteraction obj) throws JsonProcessingException {
        return getOtherInteractionObjectWriter().writeValueAsString(obj);
    }

    public static PageVisit PageVisitFromJsonString(String json) throws IOException {
        return getPageVisitObjectReader().readValue(json);
    }

    public static String PageVisitToJsonString(PageVisit obj) throws JsonProcessingException {
        return getPageVisitObjectWriter().writeValueAsString(obj);
    }

    public static PlacementRemove PlacementRemoveFromJsonString(String json) throws IOException {
        return getPlacementRemoveObjectReader().readValue(json);
    }

    public static String PlacementRemoveToJsonString(PlacementRemove obj) throws JsonProcessingException {
        return getPlacementRemoveObjectWriter().writeValueAsString(obj);
    }

    public static PlacementUpsert PlacementUpsertFromJsonString(String json) throws IOException {
        return getPlacementUpsertObjectReader().readValue(json);
    }

    public static String PlacementUpsertToJsonString(PlacementUpsert obj) throws JsonProcessingException {
        return getPlacementUpsertObjectWriter().writeValueAsString(obj);
    }

    public static PurchaseComplete PurchaseCompleteFromJsonString(String json) throws IOException {
        return getPurchaseCompleteObjectReader().readValue(json);
    }

    public static String PurchaseCompleteToJsonString(PurchaseComplete obj) throws JsonProcessingException {
        return getPurchaseCompleteObjectWriter().writeValueAsString(obj);
    }

    public static RateProduct RateProductFromJsonString(String json) throws IOException {
        return getRateProductObjectReader().readValue(json);
    }

    public static String RateProductToJsonString(RateProduct obj) throws JsonProcessingException {
        return getRateProductObjectWriter().writeValueAsString(obj);
    }

    public static RecoRequest RecoRequestFromJsonString(String json) throws IOException {
        return getRecoRequestObjectReader().readValue(json);
    }

    public static String RecoRequestToJsonString(RecoRequest obj) throws JsonProcessingException {
        return getRecoRequestObjectWriter().writeValueAsString(obj);
    }

    public static RecoShow RecoShowFromJsonString(String json) throws IOException {
        return getRecoShowObjectReader().readValue(json);
    }

    public static String RecoShowToJsonString(RecoShow obj) throws JsonProcessingException {
        return getRecoShowObjectWriter().writeValueAsString(obj);
    }

    public static RemoveFromCart RemoveFromCartFromJsonString(String json) throws IOException {
        return getRemoveFromCartObjectReader().readValue(json);
    }

    public static String RemoveFromCartToJsonString(RemoveFromCart obj) throws JsonProcessingException {
        return getRemoveFromCartObjectWriter().writeValueAsString(obj);
    }

    public static RemoveFromList RemoveFromListFromJsonString(String json) throws IOException {
        return getRemoveFromListObjectReader().readValue(json);
    }

    public static String RemoveFromListToJsonString(RemoveFromList obj) throws JsonProcessingException {
        return getRemoveFromListObjectWriter().writeValueAsString(obj);
    }

    public static CartPageView CartPageViewFromJsonString(String json) throws IOException {
        return getCartPageViewObjectReader().readValue(json);
    }

    public static String CartPageViewToJsonString(CartPageView obj) throws JsonProcessingException {
        return getCartPageViewObjectWriter().writeValueAsString(obj);
    }

    public static SortItems SortItemsFromJsonString(String json) throws IOException {
        return getSortItemsObjectReader().readValue(json);
    }

    public static String SortItemsToJsonString(SortItems obj) throws JsonProcessingException {
        return getSortItemsObjectWriter().writeValueAsString(obj);
    }

    public static UnknownEvent UnknownEventFromJsonString(String json) throws IOException {
        return getUnknownEventObjectReader().readValue(json);
    }

    public static String UnknownEventToJsonString(UnknownEvent obj) throws JsonProcessingException {
        return getUnknownEventObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader AddToCartReader;
    private static ObjectWriter AddToCartWriter;

    private static void instantiateAddToCartMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        AddToCartReader = mapper.readerFor(AddToCart.class);
        AddToCartWriter = mapper.writerFor(AddToCart.class);
    }

    private static ObjectReader getAddToCartObjectReader() {
        if (AddToCartReader == null) instantiateAddToCartMapper();
        return AddToCartReader;
    }

    private static ObjectWriter getAddToCartObjectWriter() {
        if (AddToCartWriter == null) instantiateAddToCartMapper();
        return AddToCartWriter;
    }

    private static ObjectReader AddToListReader;
    private static ObjectWriter AddToListWriter;

    private static void instantiateAddToListMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        AddToListReader = mapper.readerFor(AddToList.class);
        AddToListWriter = mapper.writerFor(AddToList.class);
    }

    private static ObjectReader getAddToListObjectReader() {
        if (AddToListReader == null) instantiateAddToListMapper();
        return AddToListReader;
    }

    private static ObjectWriter getAddToListObjectWriter() {
        if (AddToListWriter == null) instantiateAddToListMapper();
        return AddToListWriter;
    }

    private static ObjectReader APISettingsReader;
    private static ObjectWriter APISettingsWriter;

    private static void instantiateAPISettingsMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        APISettingsReader = mapper.readerFor(APISettings.class);
        APISettingsWriter = mapper.writerFor(APISettings.class);
    }

    private static ObjectReader getAPISettingsObjectReader() {
        if (APISettingsReader == null) instantiateAPISettingsMapper();
        return APISettingsReader;
    }

    private static ObjectWriter getAPISettingsObjectWriter() {
        if (APISettingsWriter == null) instantiateAPISettingsMapper();
        return APISettingsWriter;
    }

    private static ObjectReader CategoryPageViewReader;
    private static ObjectWriter CategoryPageViewWriter;

    private static void instantiateCategoryPageViewMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        CategoryPageViewReader = mapper.readerFor(CategoryPageView.class);
        CategoryPageViewWriter = mapper.writerFor(CategoryPageView.class);
    }

    private static ObjectReader getCategoryPageViewObjectReader() {
        if (CategoryPageViewReader == null) instantiateCategoryPageViewMapper();
        return CategoryPageViewReader;
    }

    private static ObjectWriter getCategoryPageViewObjectWriter() {
        if (CategoryPageViewWriter == null) instantiateCategoryPageViewMapper();
        return CategoryPageViewWriter;
    }

    private static ObjectReader CheckoutStartReader;
    private static ObjectWriter CheckoutStartWriter;

    private static void instantiateCheckoutStartMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        CheckoutStartReader = mapper.readerFor(CheckoutStart.class);
        CheckoutStartWriter = mapper.writerFor(CheckoutStart.class);
    }

    private static ObjectReader getCheckoutStartObjectReader() {
        if (CheckoutStartReader == null) instantiateCheckoutStartMapper();
        return CheckoutStartReader;
    }

    private static ObjectWriter getCheckoutStartObjectWriter() {
        if (CheckoutStartWriter == null) instantiateCheckoutStartMapper();
        return CheckoutStartWriter;
    }

    private static ObjectReader CommonReader;
    private static ObjectWriter CommonWriter;

    private static void instantiateCommonMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        CommonReader = mapper.readerFor(Object.class);
        CommonWriter = mapper.writerFor(Object.class);
    }

    private static ObjectReader getCommonObjectReader() {
        if (CommonReader == null) instantiateCommonMapper();
        return CommonReader;
    }

    private static ObjectWriter getCommonObjectWriter() {
        if (CommonWriter == null) instantiateCommonMapper();
        return CommonWriter;
    }

    private static ObjectReader DetailProductViewReader;
    private static ObjectWriter DetailProductViewWriter;

    private static void instantiateDetailProductViewMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        DetailProductViewReader = mapper.readerFor(DetailProductView.class);
        DetailProductViewWriter = mapper.writerFor(DetailProductView.class);
    }

    private static ObjectReader getDetailProductViewObjectReader() {
        if (DetailProductViewReader == null) instantiateDetailProductViewMapper();
        return DetailProductViewReader;
    }

    private static ObjectWriter getDetailProductViewObjectWriter() {
        if (DetailProductViewWriter == null) instantiateDetailProductViewMapper();
        return DetailProductViewWriter;
    }

    private static ObjectReader HomePageViewReader;
    private static ObjectWriter HomePageViewWriter;

    private static void instantiateHomePageViewMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        HomePageViewReader = mapper.readerFor(HomePageView.class);
        HomePageViewWriter = mapper.writerFor(HomePageView.class);
    }

    private static ObjectReader getHomePageViewObjectReader() {
        if (HomePageViewReader == null) instantiateHomePageViewMapper();
        return HomePageViewReader;
    }

    private static ObjectWriter getHomePageViewObjectWriter() {
        if (HomePageViewWriter == null) instantiateHomePageViewMapper();
        return HomePageViewWriter;
    }

    private static ObjectReader ImageInteractionReader;
    private static ObjectWriter ImageInteractionWriter;

    private static void instantiateImageInteractionMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        ImageInteractionReader = mapper.readerFor(ImageInteraction.class);
        ImageInteractionWriter = mapper.writerFor(ImageInteraction.class);
    }

    private static ObjectReader getImageInteractionObjectReader() {
        if (ImageInteractionReader == null) instantiateImageInteractionMapper();
        return ImageInteractionReader;
    }

    private static ObjectWriter getImageInteractionObjectWriter() {
        if (ImageInteractionWriter == null) instantiateImageInteractionMapper();
        return ImageInteractionWriter;
    }

    private static ObjectReader RemoveItemReader;
    private static ObjectWriter RemoveItemWriter;

    private static void instantiateRemoveItemMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        RemoveItemReader = mapper.readerFor(RemoveItem.class);
        RemoveItemWriter = mapper.writerFor(RemoveItem.class);
    }

    private static ObjectReader getRemoveItemObjectReader() {
        if (RemoveItemReader == null) instantiateRemoveItemMapper();
        return RemoveItemReader;
    }

    private static ObjectWriter getRemoveItemObjectWriter() {
        if (RemoveItemWriter == null) instantiateRemoveItemMapper();
        return RemoveItemWriter;
    }

    private static ObjectReader UpsertItemReader;
    private static ObjectWriter UpsertItemWriter;

    private static void instantiateUpsertItemMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        UpsertItemReader = mapper.readerFor(UpsertItem.class);
        UpsertItemWriter = mapper.writerFor(UpsertItem.class);
    }

    private static ObjectReader getUpsertItemObjectReader() {
        if (UpsertItemReader == null) instantiateUpsertItemMapper();
        return UpsertItemReader;
    }

    private static ObjectWriter getUpsertItemObjectWriter() {
        if (UpsertItemWriter == null) instantiateUpsertItemMapper();
        return UpsertItemWriter;
    }

    private static ObjectReader ListViewReader;
    private static ObjectWriter ListViewWriter;

    private static void instantiateListViewMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        ListViewReader = mapper.readerFor(ListView.class);
        ListViewWriter = mapper.writerFor(ListView.class);
    }

    private static ObjectReader getListViewObjectReader() {
        if (ListViewReader == null) instantiateListViewMapper();
        return ListViewReader;
    }

    private static ObjectWriter getListViewObjectWriter() {
        if (ListViewWriter == null) instantiateListViewMapper();
        return ListViewWriter;
    }

    private static ObjectReader OfflineRecommendationsRemoveReader;
    private static ObjectWriter OfflineRecommendationsRemoveWriter;

    private static void instantiateOfflineRecommendationsRemoveMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        OfflineRecommendationsRemoveReader = mapper.readerFor(OfflineRecommendationsRemove.class);
        OfflineRecommendationsRemoveWriter = mapper.writerFor(OfflineRecommendationsRemove.class);
    }

    private static ObjectReader getOfflineRecommendationsRemoveObjectReader() {
        if (OfflineRecommendationsRemoveReader == null) instantiateOfflineRecommendationsRemoveMapper();
        return OfflineRecommendationsRemoveReader;
    }

    private static ObjectWriter getOfflineRecommendationsRemoveObjectWriter() {
        if (OfflineRecommendationsRemoveWriter == null) instantiateOfflineRecommendationsRemoveMapper();
        return OfflineRecommendationsRemoveWriter;
    }

    private static ObjectReader OfflineRecommendationsUpsertReader;
    private static ObjectWriter OfflineRecommendationsUpsertWriter;

    private static void instantiateOfflineRecommendationsUpsertMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        OfflineRecommendationsUpsertReader = mapper.readerFor(OfflineRecommendationsUpsert.class);
        OfflineRecommendationsUpsertWriter = mapper.writerFor(OfflineRecommendationsUpsert.class);
    }

    private static ObjectReader getOfflineRecommendationsUpsertObjectReader() {
        if (OfflineRecommendationsUpsertReader == null) instantiateOfflineRecommendationsUpsertMapper();
        return OfflineRecommendationsUpsertReader;
    }

    private static ObjectWriter getOfflineRecommendationsUpsertObjectWriter() {
        if (OfflineRecommendationsUpsertWriter == null) instantiateOfflineRecommendationsUpsertMapper();
        return OfflineRecommendationsUpsertWriter;
    }

    private static ObjectReader OtherInteractionReader;
    private static ObjectWriter OtherInteractionWriter;

    private static void instantiateOtherInteractionMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        OtherInteractionReader = mapper.readerFor(OtherInteraction.class);
        OtherInteractionWriter = mapper.writerFor(OtherInteraction.class);
    }

    private static ObjectReader getOtherInteractionObjectReader() {
        if (OtherInteractionReader == null) instantiateOtherInteractionMapper();
        return OtherInteractionReader;
    }

    private static ObjectWriter getOtherInteractionObjectWriter() {
        if (OtherInteractionWriter == null) instantiateOtherInteractionMapper();
        return OtherInteractionWriter;
    }

    private static ObjectReader PageVisitReader;
    private static ObjectWriter PageVisitWriter;

    private static void instantiatePageVisitMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        PageVisitReader = mapper.readerFor(PageVisit.class);
        PageVisitWriter = mapper.writerFor(PageVisit.class);
    }

    private static ObjectReader getPageVisitObjectReader() {
        if (PageVisitReader == null) instantiatePageVisitMapper();
        return PageVisitReader;
    }

    private static ObjectWriter getPageVisitObjectWriter() {
        if (PageVisitWriter == null) instantiatePageVisitMapper();
        return PageVisitWriter;
    }

    private static ObjectReader PlacementRemoveReader;
    private static ObjectWriter PlacementRemoveWriter;

    private static void instantiatePlacementRemoveMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        PlacementRemoveReader = mapper.readerFor(PlacementRemove.class);
        PlacementRemoveWriter = mapper.writerFor(PlacementRemove.class);
    }

    private static ObjectReader getPlacementRemoveObjectReader() {
        if (PlacementRemoveReader == null) instantiatePlacementRemoveMapper();
        return PlacementRemoveReader;
    }

    private static ObjectWriter getPlacementRemoveObjectWriter() {
        if (PlacementRemoveWriter == null) instantiatePlacementRemoveMapper();
        return PlacementRemoveWriter;
    }

    private static ObjectReader PlacementUpsertReader;
    private static ObjectWriter PlacementUpsertWriter;

    private static void instantiatePlacementUpsertMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        PlacementUpsertReader = mapper.readerFor(PlacementUpsert.class);
        PlacementUpsertWriter = mapper.writerFor(PlacementUpsert.class);
    }

    private static ObjectReader getPlacementUpsertObjectReader() {
        if (PlacementUpsertReader == null) instantiatePlacementUpsertMapper();
        return PlacementUpsertReader;
    }

    private static ObjectWriter getPlacementUpsertObjectWriter() {
        if (PlacementUpsertWriter == null) instantiatePlacementUpsertMapper();
        return PlacementUpsertWriter;
    }

    private static ObjectReader PurchaseCompleteReader;
    private static ObjectWriter PurchaseCompleteWriter;

    private static void instantiatePurchaseCompleteMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        PurchaseCompleteReader = mapper.readerFor(PurchaseComplete.class);
        PurchaseCompleteWriter = mapper.writerFor(PurchaseComplete.class);
    }

    private static ObjectReader getPurchaseCompleteObjectReader() {
        if (PurchaseCompleteReader == null) instantiatePurchaseCompleteMapper();
        return PurchaseCompleteReader;
    }

    private static ObjectWriter getPurchaseCompleteObjectWriter() {
        if (PurchaseCompleteWriter == null) instantiatePurchaseCompleteMapper();
        return PurchaseCompleteWriter;
    }

    private static ObjectReader RateProductReader;
    private static ObjectWriter RateProductWriter;

    private static void instantiateRateProductMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        RateProductReader = mapper.readerFor(RateProduct.class);
        RateProductWriter = mapper.writerFor(RateProduct.class);
    }

    private static ObjectReader getRateProductObjectReader() {
        if (RateProductReader == null) instantiateRateProductMapper();
        return RateProductReader;
    }

    private static ObjectWriter getRateProductObjectWriter() {
        if (RateProductWriter == null) instantiateRateProductMapper();
        return RateProductWriter;
    }

    private static ObjectReader RecoRequestReader;
    private static ObjectWriter RecoRequestWriter;

    private static void instantiateRecoRequestMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        RecoRequestReader = mapper.readerFor(RecoRequest.class);
        RecoRequestWriter = mapper.writerFor(RecoRequest.class);
    }

    private static ObjectReader getRecoRequestObjectReader() {
        if (RecoRequestReader == null) instantiateRecoRequestMapper();
        return RecoRequestReader;
    }

    private static ObjectWriter getRecoRequestObjectWriter() {
        if (RecoRequestWriter == null) instantiateRecoRequestMapper();
        return RecoRequestWriter;
    }

    private static ObjectReader RecoShowReader;
    private static ObjectWriter RecoShowWriter;

    private static void instantiateRecoShowMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        RecoShowReader = mapper.readerFor(RecoShow.class);
        RecoShowWriter = mapper.writerFor(RecoShow.class);
    }

    private static ObjectReader getRecoShowObjectReader() {
        if (RecoShowReader == null) instantiateRecoShowMapper();
        return RecoShowReader;
    }

    private static ObjectWriter getRecoShowObjectWriter() {
        if (RecoShowWriter == null) instantiateRecoShowMapper();
        return RecoShowWriter;
    }

    private static ObjectReader RemoveFromCartReader;
    private static ObjectWriter RemoveFromCartWriter;

    private static void instantiateRemoveFromCartMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        RemoveFromCartReader = mapper.readerFor(RemoveFromCart.class);
        RemoveFromCartWriter = mapper.writerFor(RemoveFromCart.class);
    }

    private static ObjectReader getRemoveFromCartObjectReader() {
        if (RemoveFromCartReader == null) instantiateRemoveFromCartMapper();
        return RemoveFromCartReader;
    }

    private static ObjectWriter getRemoveFromCartObjectWriter() {
        if (RemoveFromCartWriter == null) instantiateRemoveFromCartMapper();
        return RemoveFromCartWriter;
    }

    private static ObjectReader RemoveFromListReader;
    private static ObjectWriter RemoveFromListWriter;

    private static void instantiateRemoveFromListMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        RemoveFromListReader = mapper.readerFor(RemoveFromList.class);
        RemoveFromListWriter = mapper.writerFor(RemoveFromList.class);
    }

    private static ObjectReader getRemoveFromListObjectReader() {
        if (RemoveFromListReader == null) instantiateRemoveFromListMapper();
        return RemoveFromListReader;
    }

    private static ObjectWriter getRemoveFromListObjectWriter() {
        if (RemoveFromListWriter == null) instantiateRemoveFromListMapper();
        return RemoveFromListWriter;
    }

    private static ObjectReader CartPageViewReader;
    private static ObjectWriter CartPageViewWriter;

    private static void instantiateCartPageViewMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        CartPageViewReader = mapper.readerFor(CartPageView.class);
        CartPageViewWriter = mapper.writerFor(CartPageView.class);
    }

    private static ObjectReader getCartPageViewObjectReader() {
        if (CartPageViewReader == null) instantiateCartPageViewMapper();
        return CartPageViewReader;
    }

    private static ObjectWriter getCartPageViewObjectWriter() {
        if (CartPageViewWriter == null) instantiateCartPageViewMapper();
        return CartPageViewWriter;
    }

    private static ObjectReader SortItemsReader;
    private static ObjectWriter SortItemsWriter;

    private static void instantiateSortItemsMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        SortItemsReader = mapper.readerFor(SortItems.class);
        SortItemsWriter = mapper.writerFor(SortItems.class);
    }

    private static ObjectReader getSortItemsObjectReader() {
        if (SortItemsReader == null) instantiateSortItemsMapper();
        return SortItemsReader;
    }

    private static ObjectWriter getSortItemsObjectWriter() {
        if (SortItemsWriter == null) instantiateSortItemsMapper();
        return SortItemsWriter;
    }

    private static ObjectReader UnknownEventReader;
    private static ObjectWriter UnknownEventWriter;

    private static void instantiateUnknownEventMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        UnknownEventReader = mapper.readerFor(UnknownEvent.class);
        UnknownEventWriter = mapper.writerFor(UnknownEvent.class);
    }

    private static ObjectReader getUnknownEventObjectReader() {
        if (UnknownEventReader == null) instantiateUnknownEventMapper();
        return UnknownEventReader;
    }

    private static ObjectWriter getUnknownEventObjectWriter() {
        if (UnknownEventWriter == null) instantiateUnknownEventMapper();
        return UnknownEventWriter;
    }
}
