package org.tunes.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder

public class EmolistFE extends PlaylistFE{
    private String emotion;

}
