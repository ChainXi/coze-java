package com.coze.openapi.client.bots;

import com.coze.openapi.client.common.BaseResp;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PublishBotResp extends BaseResp {
  @JsonProperty("bot_id")
  private String botID;

  @JsonProperty("version")
  private String botVersion;
}
