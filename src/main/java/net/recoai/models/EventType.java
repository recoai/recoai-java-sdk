package net.recoai.models;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum EventType {
    ADD_TO_CART, ADD_TO_LIST, CART_PAGE_VIEW, CATEGORY_PAGE_VIEW, CHANGE_ITEM_STOCK_STATE, CHECKOUT_START, DETAIL_PRODUCT_VIEW, HOME_PAGE_VIEW, IMAGE_INTERACTION, ITEM_REMOVE, ITEM_UPSERT, LIST_VIEW, OFFLINE_RECOMMENDATIONS_REMOVE, OFFLINE_RECOMMENDATIONS_UPSERT, OTHER_INTERACTION, PAGE_VISIT, PLACEMENT_REMOVE, PLACEMENT_UPSERT, PURCHASE_COMPLETE, RATE_PRODUCT, RECO_REQUEST, RECO_SHOW, REMOVE_FROM_CART, REMOVE_FROM_LIST, SEARCH_ITEMS, SORT_ITEMS, UNKNOWN_EVENT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ADD_TO_CART: return "AddToCart";
            case ADD_TO_LIST: return "AddToList";
            case CART_PAGE_VIEW: return "CartPageView";
            case CATEGORY_PAGE_VIEW: return "CategoryPageView";
            case CHANGE_ITEM_STOCK_STATE: return "ChangeItemStockState";
            case CHECKOUT_START: return "CheckoutStart";
            case DETAIL_PRODUCT_VIEW: return "DetailProductView";
            case HOME_PAGE_VIEW: return "HomePageView";
            case IMAGE_INTERACTION: return "ImageInteraction";
            case ITEM_REMOVE: return "ItemRemove";
            case ITEM_UPSERT: return "ItemUpsert";
            case LIST_VIEW: return "ListView";
            case OFFLINE_RECOMMENDATIONS_REMOVE: return "OfflineRecommendationsRemove";
            case OFFLINE_RECOMMENDATIONS_UPSERT: return "OfflineRecommendationsUpsert";
            case OTHER_INTERACTION: return "OtherInteraction";
            case PAGE_VISIT: return "PageVisit";
            case PLACEMENT_REMOVE: return "PlacementRemove";
            case PLACEMENT_UPSERT: return "PlacementUpsert";
            case PURCHASE_COMPLETE: return "PurchaseComplete";
            case RATE_PRODUCT: return "RateProduct";
            case RECO_REQUEST: return "RecoRequest";
            case RECO_SHOW: return "RecoShow";
            case REMOVE_FROM_CART: return "RemoveFromCart";
            case REMOVE_FROM_LIST: return "RemoveFromList";
            case SEARCH_ITEMS: return "SearchItems";
            case SORT_ITEMS: return "SortItems";
            case UNKNOWN_EVENT: return "UnknownEvent";
        }
        return null;
    }

    @JsonCreator
    public static EventType forValue(String value) throws IOException {
        if (value.equals("AddToCart")) return ADD_TO_CART;
        if (value.equals("AddToList")) return ADD_TO_LIST;
        if (value.equals("CartPageView")) return CART_PAGE_VIEW;
        if (value.equals("CategoryPageView")) return CATEGORY_PAGE_VIEW;
        if (value.equals("ChangeItemStockState")) return CHANGE_ITEM_STOCK_STATE;
        if (value.equals("CheckoutStart")) return CHECKOUT_START;
        if (value.equals("DetailProductView")) return DETAIL_PRODUCT_VIEW;
        if (value.equals("HomePageView")) return HOME_PAGE_VIEW;
        if (value.equals("ImageInteraction")) return IMAGE_INTERACTION;
        if (value.equals("ItemRemove")) return ITEM_REMOVE;
        if (value.equals("ItemUpsert")) return ITEM_UPSERT;
        if (value.equals("ListView")) return LIST_VIEW;
        if (value.equals("OfflineRecommendationsRemove")) return OFFLINE_RECOMMENDATIONS_REMOVE;
        if (value.equals("OfflineRecommendationsUpsert")) return OFFLINE_RECOMMENDATIONS_UPSERT;
        if (value.equals("OtherInteraction")) return OTHER_INTERACTION;
        if (value.equals("PageVisit")) return PAGE_VISIT;
        if (value.equals("PlacementRemove")) return PLACEMENT_REMOVE;
        if (value.equals("PlacementUpsert")) return PLACEMENT_UPSERT;
        if (value.equals("PurchaseComplete")) return PURCHASE_COMPLETE;
        if (value.equals("RateProduct")) return RATE_PRODUCT;
        if (value.equals("RecoRequest")) return RECO_REQUEST;
        if (value.equals("RecoShow")) return RECO_SHOW;
        if (value.equals("RemoveFromCart")) return REMOVE_FROM_CART;
        if (value.equals("RemoveFromList")) return REMOVE_FROM_LIST;
        if (value.equals("SearchItems")) return SEARCH_ITEMS;
        if (value.equals("SortItems")) return SORT_ITEMS;
        if (value.equals("UnknownEvent")) return UNKNOWN_EVENT;
        throw new IOException("Cannot deserialize EventType");
    }
}
